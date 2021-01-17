package tree;

import java.util.Arrays;

/**
 * @Author Natasha
 * @Description
 * @Date 2021/1/14 16:04
 **/
public class 二叉树的坡度 {
    static int res = 0;
    public static int findTilt(TreeNode root) {
        findTiltInteger(root);
        return res;
    }
    public static int findTiltInteger(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left = findTiltInteger(root.left);
        int right = findTiltInteger(root.right);
        res += Math.abs(right - left);
        return left + right + root.val;
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(4);
        TreeNode a11 = new TreeNode(2);
        TreeNode a12 = new TreeNode(9);
        a1.left = a11;
        a1.right = a12;
        TreeNode b11 = new TreeNode(3);
        TreeNode b12 = new TreeNode(5);
        a11.left = b11;
        a11.right = b12;
        TreeNode c = new TreeNode(7);
        a12.left =c;
        System.out.println(findTilt(a1));
    }
}
