package tree.again;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author Natasha
 * @Description 这道题做的时候没思路，建议好好想想再做一遍
 * @Date 2021/1/14 19:45
 **/
public class 合并二叉树 {
    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null){
            return t2;
        }else if(t2 == null){
            return t1;
        }
        TreeNode t = new TreeNode(t1.val + t2.val);
        t.left = mergeTrees(t1.left, t2.left);
        t.right = mergeTrees(t1.right, t2.right);
        return t;
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(1);
        TreeNode a11 = new TreeNode(3);
        TreeNode a12 = new TreeNode(2);
        a1.left = a11;
        a1.right = a12;
        TreeNode b11 = new TreeNode(5);
        a11.left = b11;

        TreeNode za1 = new TreeNode(2);
        TreeNode za11 = new TreeNode(1);
        TreeNode za12 = new TreeNode(3);
        za1.left = za11;
        za1.right = za12;
        TreeNode zb11 = new TreeNode(4);
        TreeNode zb12 = new TreeNode(7);
        za11.right = zb11;
        za12.right = zb12;

        TreeNode node = mergeTrees(a1, za1);
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
