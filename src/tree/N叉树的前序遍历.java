package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Natasha
 * @Description
 * @Date 2021/1/15 10:39
 **/
public class N叉树的前序遍历 {
    static List<Integer> list = new ArrayList<>();
    public static List<Integer> preorder(Node root) {
        preorderTree(root);
        return list;
    }
    public static void preorderTree(Node root) {
        if(root == null){
            return;
        }
        list.add(root.val);
        if(root.children != null){
            for (int i = 0; i < root.children.size(); i++) {
                preorderTree(root.children.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        Node n1 = new Node(3);
        Node n2 = new Node(2);
        Node n3 = new Node(4);
        List<Node> children = new ArrayList<>();
        children.add(n1);
        children.add(n2);
        children.add(n3);
        node.children = children;
        Node a1 = new Node(5);
        Node a2 = new Node(6);
        List<Node> achildren = new ArrayList<>();
        achildren.add(a1);
        achildren.add(a2);
        n1.children = achildren;
        preorder(node).stream().forEach(System.out::println);
    }
}
