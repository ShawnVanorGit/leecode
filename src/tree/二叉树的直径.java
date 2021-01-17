package tree;

/**
 * @Author Natasha
 * @Description
 * @Date 2021/1/14 15:55
 **/
public class 二叉树的直径 {
    static int cnt = 0;
    public static int diameterOfBinaryTree(TreeNode root) {
        diameterOfBinaryTreeInteger(root);
        return cnt;
    }
    public static int diameterOfBinaryTreeInteger(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left = diameterOfBinaryTreeInteger(root.left);
        int right = diameterOfBinaryTreeInteger(root.right);
        cnt = Math.max(cnt, left + right);
        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(1);
        TreeNode a11 = new TreeNode(2);
        TreeNode a12 = new TreeNode(3);
        a1.left = a11;
        a1.right = a12;
        TreeNode c11 = new TreeNode(4);
        TreeNode c12 = new TreeNode(5);
        a11.left = c11;
        a11.right = c12;

        int flag1 = diameterOfBinaryTree(a1);
        System.out.println(flag1);

    }
}
