import anltr.XqueryBaseVisitor;
import anltr.XqueryParser;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import sun.awt.image.ImageWatched;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.nio.file.StandardWatchEventKinds;
import java.util.*;

/**
 * Created by tom on 1/29/2017.
 */
public class MyVisitor extends XqueryBaseVisitor<Object>{
    private LinkedList<Curstate> Stack = new LinkedList<Curstate>();
    private LinkedList<LinkedList<Node>> Stack_output = new LinkedList<LinkedList<Node>>();
    private Map<String, Node> varlist = new HashMap();
    private LinkedList<Node> emp = new LinkedList<>();
    public LinkedList<Node> output = new LinkedList<>();
    private static LinkedList<Node> unique(LinkedList<Node> node_list) {
        LinkedList<Node> res = new LinkedList<Node>();
        HashMap<Node, Boolean> hashMap = new HashMap<Node, Boolean>();
        for (int i = 0; i < node_list.size(); i++) {
            if (!hashMap.containsKey(node_list.get(i))) {
                hashMap.put(node_list.get(i), true);
                res.add(node_list.get(i));
            }
        }
        return res;
    }
    @Override public Object visitXQVariable(XqueryParser.XQVariableContext ctx){
        System.out.println("$var");
        String name = ctx.var().NAME().getText();
        LinkedList<Node> var_list = new LinkedList<>();
        var_list.add(varlist.get(name));
        return var_list;
    }
    @Override public Object visitXQAp(XqueryParser.XQApContext ctx){
        System.out.println("ap");
        LinkedList<Node> ans = (LinkedList<Node>) visit(ctx.ap());
        return ans;
    }

    @Override public Object visitXQAll(XqueryParser.XQAllContext ctx){
        System.out.println("xq//rp");
        LinkedList<Node> excute = (LinkedList<Node>) visit(ctx.xq());
        Curstate cur = new Curstate();
        cur.add(excute);
        LinkedList<Node> children = cur.getAllChildren();
        Curstate now = new Curstate();
        now.add(children);
        Stack.push(now);
        LinkedList<Node> ans = (LinkedList<Node>) visit(ctx.rp());
        LinkedList<Node> result = unique(ans);
        Stack.pop();
        return result;
    }

    @Override
    public Object visitXQPar(XqueryParser.XQParContext ctx) {
        System.out.println("(xq)");
        return visit(ctx.xq());
    }

    @Override
    public Object visitXQLet(XqueryParser.XQLetContext ctx) {
        System.out.println("let");
        visit(ctx.letClause());
        return visit(ctx.xq());
    }

    @Override public Object visitXQDot(XqueryParser.XQDotContext ctx) {
        System.out.println("xq, xq");
        LinkedList<Node> result = new LinkedList<>();
        result.addAll((LinkedList<Node>) visit(ctx.xq(0)));
        result.addAll((LinkedList<Node>) visit(ctx.xq(1)));
        return result;
    }
// bu tai qing chu shi bu shi er zi
    @Override
    public Object visitXQChild(XqueryParser.XQChildContext ctx) {
        System.out.println("xq / rp");
        LinkedList<Node> excute = (LinkedList<Node>) visit(ctx.xq());
        Curstate now = new Curstate();
        now.add(excute);
     //   Curstate middle = new Curstate();
      //  middle.add(now.getChildren());
        Stack.push(now);
        LinkedList<Node> ans = (LinkedList<Node>) visit(ctx.rp());
        LinkedList<Node> res = unique(ans);
        Stack.pop();
        return res;
    }

    @Override
    public Object visitXQStringConst(XqueryParser.XQStringConstContext ctx) {
        System.out.println("StringConstant");
        Curstate cur = new Curstate();

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = null;
            builder = factory.newDocumentBuilder();
            Document doc = builder.newDocument();
            String text = ctx.StringConst().getText();
            int len = text.length();
            text = text.substring(1, len - 1);
            System.out.println("text: " + text);
            Node textNode = doc.createTextNode(text);
            cur.add(textNode);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }

        return cur.getNode();
    }

    @Override public Object visitXQTag(XqueryParser.XQTagContext ctx) {
        System.out.println("<tag>xq<tag>");
        String tagname = ctx.NAME(0).getText();
        LinkedList<Node> res = (LinkedList<Node>) visit(ctx.xq());
        LinkedList<Node> ans = new LinkedList<Node>();
        try{
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.newDocument();
            Node tag = doc.createElement(tagname);
            for (Node node : res) {
                Node child = doc.importNode(node, true);
                tag.appendChild(child);
            }
            ans.add(tag);

        } catch (Exception ex){
            ex.printStackTrace();
        }
        return ans;
    }

    @Override public Object visitVar(XqueryParser.VarContext ctx) {
        System.out.println("var");
        String name = ctx.getText();
        LinkedList<Node> variable = new LinkedList<Node>();
        variable.add((Node)varlist.get(name));
        return variable;
    }

    @Override public Object visitForClause(XqueryParser.ForClauseContext ctx) {
        System.out.println("for clause");
        return emp;
    }

    @Override public Object visitLetClause(XqueryParser.LetClauseContext ctx) {
        System.out.println("let clause");
        List<XqueryParser.VarContext> var_list = ctx.var();
        LinkedList<Node> temp;
        int len = var_list.size();
        for(int i = 0;i < len;i ++) {
            temp = (LinkedList<Node>) visit(ctx.xq(i));
            varlist.put(var_list.get(i).getText(), temp.get(0));
        }
        return emp;
    }

    @Override public Boolean visitWhereClause(XqueryParser.WhereClauseContext ctx) {
        System.out.println("where clause");
        return (boolean) visit(ctx.cond()); }

    @Override public Object visitReturnClause(XqueryParser.ReturnClauseContext ctx) {
        System.out.println("return clause");
        LinkedList<Node> ans = (LinkedList<Node>) visit(ctx.xq());
        LinkedList<Node> now = Stack_output.peek();
        Stack_output.pop();
        now.addAll(ans);
        Stack_output.push(now);
        return emp;
    }

    @Override public Boolean visitXQCondEqual(XqueryParser.XQCondEqualContext ctx) {
        System.out.println("xq == xq");
        LinkedList<Node> xq1 = (LinkedList<Node>) visit(ctx.xq(0));
        LinkedList<Node> xq2 = (LinkedList<Node>) visit(ctx.xq(1));
        int len1 = xq1.size();
        int len2 = xq2.size();
        if(len1 != len2) return false;
        for(int i = 0;i < len1;i ++)
            if (!xq1.get(i).isEqualNode(xq2.get(i)))
                return false;
        return true;
    }

    @Override public Boolean visitXQCondIs(XqueryParser.XQCondIsContext ctx) {
        System.out.println("xq is xq");
        LinkedList<Node> xq1 = (LinkedList<Node>) visit(ctx.xq(0));
        LinkedList<Node> xq2 = (LinkedList<Node>) visit(ctx.xq(1));
        int len1 = xq1.size();
        int len2 = xq2.size();
        if(len1 != len2) return false;
        for(int i = 0;i < len1;i ++)
            if (!xq1.get(i).isSameNode(xq2.get(i)))
                return false;
        return true; }

    @Override public Boolean visitXQCondAnd(XqueryParser.XQCondAndContext ctx) {
        System.out.println("xq and xq");
        boolean t1 = (boolean) visit(ctx.cond(0));
        boolean t2 = (boolean) visit(ctx.cond(1));
        return t1 && t2;
    }

    @Override public Boolean visitXQCondNot(XqueryParser.XQCondNotContext ctx) {
        System.out.println("not xq");
        return !((boolean) visit(ctx.cond()));
    }

    @Override public Boolean visitXQCondEmpty(XqueryParser.XQCondEmptyContext ctx) {
        System.out.println("empty(xq)");
        boolean t1 = ((LinkedList<Node>) visit(ctx.xq())).isEmpty();
        System.out.println("EmPTY!" + t1);
        return t1;
    }
    @Override public Object visitFLWR(XqueryParser.FLWRContext ctx){
        LinkedList<Node> now = new LinkedList<Node>();
        Stack_output.push(now);
        runFLWR(ctx.forClause().var(), ctx.forClause().xq(), ctx.letClause(), ctx.whereClause(), ctx.returnClause());

        LinkedList<Node> res = Stack_output.peek();
        Stack_output.pop();
        return res;
    }

    public Object runFLWR(List<XqueryParser.VarContext> varl, List<XqueryParser.XqContext> xql, XqueryParser.LetClauseContext l, XqueryParser.WhereClauseContext w, XqueryParser.ReturnClauseContext r){
        XqueryParser.VarContext currentvar = varl.get(0);
        XqueryParser.XqContext currentxq = xql.get(0);
        varl.remove(0);
        xql.remove(0);
        LinkedList<Node> varbuffer = (LinkedList<Node>) visit(currentxq);
        int i, n = varbuffer.size();
        String varname = currentvar.getText();
        System.out.println("Var: " + varname + " has " + n + " nodes.");
        if (varl.isEmpty()) {
            for (i = 0;i < n;i ++) {
                varlist.put(varname, varbuffer.get(i));
                System.out.println();
                if (l != null) visit(l);
                if (w == null) visit(r);
                else if((Boolean) visit(w) == true) {

                    System.out.println("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
 /*                   Node ll = varlist.get("a");
                    NodeList aa = ll.getChildNodes();
                    for (int ii = 0; ii < aa.getLength(); ii++){
                        if (aa.item(ii).getNodeName().equals("TITLE")){
                            System.out.println("I find you !!!" + aa.item(ii).getTextContent());
                        }
                    }
                    ll = varlist.get("sc");
                    aa = ll.getChildNodes();
                    for (int ii = 0; ii < aa.getLength(); ii++){
                        if (aa.item(ii).getNodeName().equals("TITLE")){
                            System.out.println("I find you !!!" + aa.item(ii).getTextContent());
                        }
                    }*/

                    visit(r);
                } else System.out.println("123" + varlist.get("a").getLastChild());
            }
        }
        else {
            for (i = 0; i < n; i++) {
                varlist.put(varname, varbuffer.get(i));
                if (varname.equals("sc")) System.out.println("varl size: " + varl.size());
                runFLWR(varl, xql, l, w, r);
            }
        }
        varl.add(0, currentvar);
        xql.add(0, currentxq);
        return emp;
    }
    @Override public Boolean visitXQCondSome(XqueryParser.XQCondSomeContext ctx) {
        Map<String, Node> buffer = varlist;
        List<XqueryParser.VarContext> var_list= ctx.var();
        LinkedList<LinkedList<Node>> temp = new LinkedList<LinkedList<Node>>();
        int len = var_list.size();
        int[] sizelist = new int[len];
        int[] flaglist = new int[len];
        for (int i = 0;i < len; i ++) {
            temp.add((LinkedList<Node>) visit(ctx.xq(i)));
            sizelist[i] = temp.get(i).size();
            flaglist[i] = 0;
        }

        while (true) {
            for (int i = 0;i < len;i ++) buffer.put(var_list.get(i).getText(), temp.get(i).get(flaglist[i]));
            if ((boolean)visit(ctx.cond()) == true) return true;
            for(int i = 0;i < len;i ++) {
                flaglist[i] += 1;
                if (flaglist[i] <= sizelist[i]) break;
                flaglist[i] = 0;
            }
            int j = 0;
            for (int i = 0;i < len;i ++) j += flaglist[i];
            if (j == 0) break;
        }

        return false;
    }

    @Override public Boolean visitXQCondOr(XqueryParser.XQCondOrContext ctx){
        System.out.println("cond or cond");
        boolean t1 = (boolean) visit(ctx.cond(0));
        boolean t2 = (boolean) visit(ctx.cond(1));
        return t1 || t2;
    }

    @Override public Boolean visitXQCondPar(XqueryParser.XQCondParContext ctx){
        System.out.println("(cond)");
        return (boolean) visit(ctx.cond());
    }


    @Override
    public Object visitAPChildren(XqueryParser.APChildrenContext ctx){
        System.out.println("doc(fname)/rp");
        String filename= (String) visit(ctx.fname());
        File xmlfile = new File(filename);

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(xmlfile);
            Curstate cs = new Curstate();
            cs.add(doc);
            Stack.push(cs);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return visit(ctx.rp());
    }

    @Override
    public Object visitAPAll(XqueryParser.APAllContext ctx){
        System.out.println("doc(fname)//rp");
        String filename= (String) visit(ctx.fname());
        File xmlfile = new File(filename);
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(xmlfile);
            Curstate cs = new Curstate();
            cs.add(doc);
            Stack.push(cs);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        Curstate curstate = Stack.peek();
        Curstate temp = new Curstate();
        try{
            for (Node node : curstate.getNode()) {
                LinkedList<Node> child = unique(curstate.getAllChildren());
                for (Node node1 : child) {
                    temp.add(node1);
                }
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Stack.push(temp);
        return visit(ctx.rp());
    }

    @Override
    public Object visitFname(XqueryParser.FnameContext ctx){
        System.out.println("fname");
        return ctx.getText();
    }

    @Override
    public Object visitRPAllChildren(XqueryParser.RPAllChildrenContext ctx){
        System.out.println("*");
        Curstate cs = Stack.peek();
        LinkedList<Node> result = new LinkedList<>();
        for (Node node : cs.getNode()){
            NodeList tmp = node.getChildNodes();
            for (int i = 0; i < tmp.getLength(); i++){
                result.add(tmp.item(i));
            }
        }
        return  result;
    }
    @Override
    public Object visitRPChild(XqueryParser.RPChildContext ctx){
        System.out.println("rp/rp");
        LinkedList<Node> first = (LinkedList<Node>) visit(ctx.rp(0));
        Curstate tmp = new Curstate();
        for (Node node : first){
            tmp.add(node);
        }
        Stack.push(tmp);
        LinkedList<Node> second = (LinkedList<Node>) visit(ctx.rp(1));
        LinkedList<Node> result = unique(second);
        Stack.pop();
        return result;
    }
    @Override
    public Object visitRPPar(XqueryParser.RPParContext ctx){
        System.out.println("(rp)");
        return visit(ctx.rp());
    }

    @Override
    public Object visitRPTagName(XqueryParser.RPTagNameContext ctx){
        System.out.println("TagName");
        LinkedList<Node> result = new LinkedList<>();
        String Tag = (String) ctx.getText();
        Curstate cs = Stack.peek();
        for (Node node : cs.getChildren())
            if (Tag.equals(node.getNodeName()))
                result.add(node);
        return result;
    }

    @Override
    public Object visitRPAttribute(XqueryParser.RPAttributeContext ctx){
        System.out.println("@attr");
        String attr = ctx.NAME().getText();
        Curstate cs = Stack.peek();
        LinkedList<Node> result = new LinkedList<Node>();
        for (Node node : cs.getNode()){
            result.add(node.getAttributes().getNamedItem(attr));
        }
        return result;
    }

    @Override
    public Object visitRPParent(XqueryParser.RPParentContext ctx){
        System.out.println("..");
        Curstate cs = Stack.peek();
        return unique(cs.getParent());
    }

    @Override
    public Object visitText(XqueryParser.TextContext ctx){
        System.out.println("TXT");
        Curstate cs = Stack.peek();
        LinkedList<Node> tmp = cs.getChildren();
        LinkedList<Node> result = new LinkedList<>();
        for (Node node : tmp){
            if (node.getNodeType() == node.TEXT_NODE) result.add(node);
        }
        return result;
    }

    @Override
    public Object visitRPAll(XqueryParser.RPAllContext ctx){
        System.out.println("rp//rp");
        LinkedList<Node> first = (LinkedList<Node>) visit(ctx.rp(0));
        Curstate cs = new Curstate();
        cs.apend(first);
        LinkedList<Node> child = cs.getParent();
        Curstate tmp = new Curstate();
        for (Node node : child) {
            tmp.add(node);
        }
        Stack.push(tmp);
        LinkedList<Node> second = (LinkedList<Node>) visit(ctx.rp(1));
        LinkedList<Node> result = unique(second);
        Stack.pop();

        return result;
    }

    @Override
    public Object visitRPCurrent(XqueryParser.RPCurrentContext ctx){
        System.out.println(".");
        Curstate cs = Stack.peek();
        return cs.getCurrent();
    }

    @Override
    public Object visitRPDot(XqueryParser.RPDotContext ctx){
        System.out.println("rp,rp");
        LinkedList<Node> first = (LinkedList<Node>) visit(ctx.rp(0));
        LinkedList<Node> second = (LinkedList<Node>) visit(ctx.rp(1));
        //for (Node node : second)
        //    first.addLast(node);
        first.addLast(second.getFirst());
        return first;
    }

    @Override
    public Object visitRPCond(XqueryParser.RPCondContext ctx){
        System.out.println("rp[f]");
        LinkedList<Node> first = (LinkedList<Node>) visit(ctx.rp());
        LinkedList<Node> result = new LinkedList<>();
        try {
            for (Node node : first) {
                Curstate cs = new Curstate();
                cs.add(node);
                Stack.push(cs);
                if ((Boolean)visit(ctx.func())) result.add(node);
                Stack.pop();
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return result;
    }

    @Override
    public Object visitFPar(XqueryParser.FParContext ctx){
        System.out.println("(f)");
        return (Boolean) visit(ctx.func());
    }

    @Override
    public Object visitFnot(XqueryParser.FnotContext ctx){
        System.out.println("not f");
        return !(Boolean)visit(ctx.func());
    }

    @Override
    public Object visitF(XqueryParser.FContext ctx){
        System.out.println("f[rp]");
        LinkedList<Node> tmp = (LinkedList) visit(ctx.rp());
        return !tmp.isEmpty();
    }

    @Override
    public Object visitFor(XqueryParser.ForContext ctx){
        System.out.println("f[or]");
        Boolean first = (Boolean) visit(ctx.func(0));
        Boolean second = (Boolean) visit(ctx.func(1));
        return (first || second);
    }

    @Override
    public Object visitFequal(XqueryParser.FequalContext ctx){
        System.out.println("f[rp = rp] f[rp eq rp]");
        LinkedList<Node> first = (LinkedList<Node>) visit(ctx.rp(0));
        LinkedList<Node> second = (LinkedList<Node>) visit(ctx.rp(1));
        for (Node node : first)
            for (Node node1 : second)
                if (node.isEqualNode(node1))
                    return true;
        return false;
    }

    @Override
    public Object visitFis(XqueryParser.FisContext ctx){
        System.out.println("f[rp==rp] f[rp is rp]");
        LinkedList<Node> first = (LinkedList<Node>) visit(ctx.rp(0));
        LinkedList<Node> second = (LinkedList<Node>) visit(ctx.rp(1));
        for (Node node : first)
            for (Node node1 : second)
                if (node.isSameNode(node1))
                    return true;

        return false;
    }

    @Override
    public Object visitFand(XqueryParser.FandContext ctx){
        System.out.println("f[and]");
        Boolean first = (Boolean) visit(ctx.func(0));
        Boolean second = (Boolean) visit(ctx.func(1));
        return (first && second);
    }

}
