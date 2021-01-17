package tree.again;

import tree.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author Natasha
 * @Description 树的高度计数器很关键，需要的是与每一层的max作比较，所以max=0
 * @Date 2021/1/15 9:22
 **/

public class N叉树的最大深度 {
    public static int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.children == null) {
            return 1;
        }
        int max = 0;
        for (Node node : root.children) {
            max = Math.max(max, maxDepth(node));
        }
        return max + 1;
    }

    public static int maxDepth1(Node root) {
        if (root == null) {
            return 0;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int cnt = 0;
        while (queue.size() > 0) {
            int size = queue.size();
            cnt++;
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                List<Node> list = node.children;
                if (list != null) {
                    for (int j = 0; j < list.size(); j++) {
                        queue.add(list.get(j));
                    }
                }
            }
        }
        return cnt;
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
        System.out.println(maxDepth(node));
    }
}
