package tree.again;

import java.util.List;

/**
 * @Author Natasha
 * @Description
 * @Date 2021/1/15 9:22
 **/
public class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
