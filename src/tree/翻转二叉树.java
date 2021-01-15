package tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author Natasha
 * @Description
 * @Date 2021/1/14 10:28
 **/
public class 翻转二叉树 {
    public static TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root;
        }
        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);
        root.left = right;
        root.right = left;
        return root;
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(4);
        TreeNode a11 = new TreeNode(2);
        TreeNode a12 = new TreeNode(7);
        a1.left = a11;
        a1.right = a12;
        TreeNode e11 = new TreeNode(1);
        TreeNode e12 = new TreeNode(3);
        a11.left = e11;
        a11.right = e12;

        TreeNode c11 = new TreeNode(6);
        TreeNode c12 = new TreeNode(9);
        a12.left = c11;
        a12.right = c12;

        TreeNode node = invertTree(a1);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        System.out.println("["+ node.val+"]");
        while(queue.size() != 0){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode tn = queue.poll();
                if(tn.left != null){
                    queue.add(tn.left);
                    System.out.printf("["+ tn.left.val+", ");
                }else if(tn.left == null){
                    System.out.printf("[null, ");
                }
                if(tn.right != null){
                    queue.add(tn.right);
                    System.out.printf(tn.right.val+"]");
                }else if(tn.right == null){
                    System.out.printf("null]");
                }
            }
            System.out.println();
        }
    }
}
