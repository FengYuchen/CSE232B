import anltr.XqueryLexer;
import anltr.XqueryParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.util.LinkedList;

/**
 * Created by tom on 1/29/2017.
 */

public class Main {
    public static void main(String[] args) throws Exception{
        String fname = args[0] + ".txt";
        File input = new File(fname);
        FileInputStream fileinput = new FileInputStream(input);
        ANTLRInputStream inputStream = new ANTLRInputStream(fileinput);
        XqueryLexer lex = new XqueryLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lex);
        XqueryParser parser = new XqueryParser(tokenStream);
        ParseTree tree = parser.ap();
        MyVisitor myVistor = new MyVisitor();
        LinkedList<Node> result = new LinkedList<Node>();
        result = (LinkedList<Node>) myVistor.visit(tree);

        DocumentBuilderFactory Factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder Builder = Factory.newDocumentBuilder();
        Document doc = Builder.newDocument();
        Curstate.printall(result);
        Node top = doc.createElement("Result");
        doc.appendChild(top);
        for (int i = 0; i < result.size(); i++){
            Element node = dfs(doc, result.get(i));
            top.appendChild(node);
        }

        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
        transformer.setOutputProperty (OutputKeys.INDENT, "yes");
        Result res = new StreamResult(new File(args[0] + ".xml"));
        Source src = new DOMSource(doc);
        transformer.transform(src, res);

    }

    private static Element dfs(Document doc, Node node){
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            Element element = doc.createElement(node.getNodeName());
            NodeList tmp = node.getChildNodes();
            for (int i = 0; i < tmp.getLength(); i++) {
                if (tmp.item(i).getNodeType() == Node.TEXT_NODE) {
                    Node txt = doc.createTextNode(node.getTextContent());
                    element.appendChild(txt);
                } else element.appendChild(dfs(doc, tmp.item(i)));
            }
            return element;
        }
        return null;
    }
}
