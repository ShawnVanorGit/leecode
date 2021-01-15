package tree;

/**
 * @Author Natasha
 * @Description
 * @Date 2021/1/14 8:05
 **/
public class 平衡二叉树 {
    static boolean flag = true;
    public static boolean isBalanced(TreeNode root) {
        isBalancedTree(root);
        return flag;
    }
    public static int isBalancedTree(TreeNode root) {
        if(root == null){
            return 1;
        }
        int left = isBalancedTree(root.left);
        int right = isBalancedTree(root.right);
        if(Math.abs(right - left) > 1){
            flag = false;
        }
        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(1);;
        TreeNode a11 = new TreeNode(2);
        TreeNode a12 = new TreeNode(2);
        a1.left = a11;
        a1.right = a12;
        TreeNode c11 = new TreeNode(3);
        TreeNode c12 = new TreeNode(3);
        a11.left = c11;
        a11.right = c12;
        TreeNode d11 = new TreeNode(4);
        TreeNode d12 = new TreeNode(4);
        c11.left = d11;
        c11.right = d12;

        boolean flag1 = isBalanced(a1);
        System.out.println(flag1);
    }
}
