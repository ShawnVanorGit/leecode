package tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author Natasha
 * @Description
 * @Date 2021/1/15 11:25
 **/
public class 二叉搜索树中的搜索 {
    public static TreeNode searchBST(TreeNode root, int val) {
        while(root != null && root.val != val){
            root = val < root.val ? root.left : root.right;
        }
        return root;
    }

    static TreeNode res1;
    public static TreeNode searchBST1(TreeNode root, int val) {
        searchBSTTree(root, val);
        return res1;
    }

    public static void searchBSTTree(TreeNode root, int val) {
        if (root == null) {
            return ;
        }
        if (root.val != val) {
            searchBST1(root.left, val);
            searchBST1(root.right, val);
        }
        if(root.val == val){
            res1 = root;
        }
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
        TreeNode node = searchBST(a1, 2);
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
