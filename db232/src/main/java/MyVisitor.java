import anltr.XqueryBaseVisitor;
import anltr.XqueryParser;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * Created by tom on 1/29/2017.
 */
public class MyVisitor extends XqueryBaseVisitor<Object>{
    private LinkedList<Curstate> Stack = new LinkedList<Curstate>();
    private static LinkedList<Node> unique(LinkedList<Node> node_list){
        LinkedList<Node> res = new LinkedList<Node>();
        HashMap<Node, Boolean> hashMap = new HashMap<Node, Boolean>();
        for (int i = 0; i < node_list.size(); i++){
            if (!hashMap.containsKey(node_list.get(i))){
                hashMap.put(node_list.get(i),true);
                res.add(node_list.get(i));
            }
        }
        return res;
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
    public Object visitAllChildren(XqueryParser.AllChildrenContext ctx){
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
    public Object visitRPChildren(XqueryParser.RPChildrenContext ctx){
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
    public Object visitRPwithPar(XqueryParser.RPwithParContext ctx){
        System.out.println("(rp)");
        return visit(ctx.rp());
    }

    @Override
    public Object visitTagName(XqueryParser.TagNameContext ctx){
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
    public Object visitAttribute(XqueryParser.AttributeContext ctx){
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
    public Object visitParent(XqueryParser.ParentContext ctx){
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
    public Object visitCurrent(XqueryParser.CurrentContext ctx){
        System.out.println(".");
        Curstate cs = Stack.peek();
        return cs.getCurrent();
    }

    @Override
    public Object visitTwoRP(XqueryParser.TwoRPContext ctx){
        System.out.println("rp,rp");
        LinkedList<Node> first = (LinkedList<Node>) visit(ctx.rp(0));
        LinkedList<Node> second = (LinkedList<Node>) visit(ctx.rp(1));
        //for (Node node : second)
        //    first.addLast(node);
        first.addLast(second.getFirst());
        return first;
    }

    @Override
    public Object visitRPCondition(XqueryParser.RPConditionContext ctx){
        System.out.println("rp[f]");
        LinkedList<Node> first = (LinkedList<Node>) visit(ctx.rp());
        LinkedList<Node> result = new LinkedList<>();
        try {
            for (Node node : first) {
                Curstate cs = new Curstate();
                cs.add(node);
                Stack.push(cs);
                if ((Boolean)visit(ctx.fltr())) result.add(node);
                Stack.pop();
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return result;
    }

    @Override
    public Object visitFRPwithPar(XqueryParser.FRPwithParContext ctx){
        System.out.println("(f)");
        return (Boolean) visit(ctx.fltr());
    }

    @Override
    public Object visitFRPnot(XqueryParser.FRPnotContext ctx){
        System.out.println("not f");
        return !(Boolean)visit(ctx.fltr());
    }

    @Override
    public Object visitFRP(XqueryParser.FRPContext ctx){
        System.out.println("f[rp]");
        LinkedList<Node> tmp = (LinkedList) visit(ctx.rp());
        return !tmp.isEmpty();
    }

    @Override
    public Object visitFRPor(XqueryParser.FRPorContext ctx){
        System.out.println("f[or]");
        Boolean first = (Boolean) visit(ctx.fltr(0));
        Boolean second = (Boolean) visit(ctx.fltr(1));
        return (first || second);
    }

    @Override
    public Object visitFRPequal(XqueryParser.FRPequalContext ctx){
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
    public Object visitFRPis(XqueryParser.FRPisContext ctx){
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
    public Object visitFRPand(XqueryParser.FRPandContext ctx){
        System.out.println("f[and]");
        Boolean first = (Boolean) visit(ctx.fltr(0));
        Boolean second = (Boolean) visit(ctx.fltr(1));
        return (first && second);
    }

}
