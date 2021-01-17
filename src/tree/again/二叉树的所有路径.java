package tree.again;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Natasha
 * @Description 注意String类型的引用问题，要new StringBuilder(sb)
 * @Date 2021/1/14 11:16
 **/
public class 二叉树的所有路径 {
    static List<String> list = new ArrayList<>();
    public static List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return list;
        }
        binaryTreePathsNode(root, new StringBuilder());
        return list;
    }
    public static void binaryTreePathsNode(TreeNode root, StringBuilder sb) {
        sb.append(root.val);
        if (root.left == null && root.right == null) {
            list.add(sb.toString());
        }
        if (root.left != null) {
            binaryTreePathsNode(root.left, new StringBuilder(sb).append("->"));
        }
        if (root.right != null) {
            binaryTreePathsNode(root.right, new StringBuilder(sb).append("->"));
        }
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(5);
        TreeNode e = new TreeNode(6);
        a1.left = b;
        a1.right = c;
        b.left = d;
        b.right = e;
        binaryTreePaths(a1).stream().forEach(System.out::println);
    }
}
