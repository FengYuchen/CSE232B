import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import sun.awt.image.ImageWatched;

import java.util.LinkedList;

/**
 * Created by tom on 1/29/2017.
 */
public class Curstate {
    private LinkedList<Node> node_list = new LinkedList<Node>();
    private LinkedList<Node> children = new LinkedList<Node>();
    private Document root;
    public static void printall(LinkedList<Node> list){
        if (list.size() == 0) System.out.println("empty contex");
        else for (int i = 0; i < list.size(); i++){
            System.out.println("Name: " + list.get(i).getNodeName() + "Text: " + list.get(i).getTextContent());
        }
    }
    public void printCurstate(){
        printall(node_list);
    }
    public void add(Node node){
        node_list.add(node);
    }
    public void add(LinkedList<Node> nodelist){
        int k = nodelist.size();
        for (int i = 0; i < k; i++)
            node_list.add(nodelist.get(i));
    }
    public void apend(LinkedList<Node> list){
        for (int i = 0; i < list.size(); i++)
            node_list.add(list.get(i));
    }
    public int size(){
        return node_list.size();
    }
    public Node item(int i){
        return node_list.get(i);
    }
    public LinkedList<Node> getNode() {
        LinkedList<Node> res = new LinkedList<Node>();
        for (int i = 0; i < node_list.size(); i++)
            res.add(node_list.get(i));
        return res;
    }
    public LinkedList<Node> getCurrent(){
        LinkedList<Node> res = new LinkedList<Node>();
        res.addAll(node_list);
        return res;
    }
    public LinkedList<Node> getChildren(){
        LinkedList<Node> res = new LinkedList<Node>();
        try{
        for (int i = 0; i < node_list.size(); i++){
            NodeList tmp = node_list.get(i).getChildNodes();
            for (int j = 0; j < tmp.getLength(); j++)
                res.add(tmp.item(j));
        }}
        catch (Exception e){
            e.printStackTrace();
        }
        return res;
    }
    public LinkedList<Node> getParent(){
        LinkedList<Node> res = new LinkedList<Node>();
        for (int i = 0; i < node_list.size(); i++){
            Node tmp = node_list.get(i).getParentNode();
            res.add(tmp);
        }
        return res;
    }
    public LinkedList<Node> getAllChildren(){
        if (!node_list.isEmpty()){
            for (int i = 0; i < node_list.size(); i++){
                findchildren(node_list.get(i));
            }
        } else System.out.println("Empty contex");
        return children;
    }
    public void findchildren(Node _root){
        while (_root.hasChildNodes()){
            children.add(_root);
            NodeList tmp = _root.getChildNodes();
            for (int i = 0; i < tmp.getLength(); i++){
                children.add(tmp.item(i));
                _root = tmp.item(i);
                findchildren(_root);
            }
        }
    }
}
