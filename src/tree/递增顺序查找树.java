package tree;

import java.util.LinkedList;
import java.util.Queue;

public class 递增顺序查找树 {
    static TreeNode node = new TreeNode(-1);
    static TreeNode res = node;
    public static TreeNode increasingBST(TreeNode root) {
        increasingBSTTree(root);
        return res.right;
    }
    public static void increasingBSTTree(TreeNode root) {
        if(root == null){
            return ;
        }
        increasingBSTTree(root.left);
        node.right = new TreeNode(root.val);
        node = node.right;
        increasingBSTTree(root.right);
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(5);
        TreeNode a11 = new TreeNode(1);
        TreeNode a12 = new TreeNode(7);
        a1.left = a11;
        a1.right = a12;
//        TreeNode a1 = new TreeNode(5);
//        TreeNode a11 = new TreeNode(3);
//        TreeNode a12 = new TreeNode(6);
//        a1.left = a11;
//        a1.right = a12;
//        TreeNode e = new TreeNode(8);
//        TreeNode f = new TreeNode(1);
//
//        TreeNode c11 = new TreeNode(2);
//        TreeNode c12 = new TreeNode(4);
//        a11.left = c11;
//        a11.right = c12;
//        c11.left = f;
//        a12.right = e;
//        TreeNode b11 = new TreeNode(7);
//        TreeNode b12 = new TreeNode(9);
//        e.left = b11;
//        e.right = b12;
        TreeNode node = increasingBST(a1);
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
