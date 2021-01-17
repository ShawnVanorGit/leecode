package tree.again;

/**
 * @Author Natasha
 * @Description
 * @Date 2021/1/13 11:54
 **/
public class 二叉树的最大深度 {
    public static int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        } else {
            int left1 = maxDepth(root.left);
            int right1 = maxDepth(root.right);
            return Math.max(left1, right1) + 1;
        }
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(1);
        TreeNode a11 = new TreeNode(9);
        TreeNode a12 = new TreeNode(20);
        a1.left = a11;
        a1.right = a12;
        TreeNode c11 = new TreeNode(15);
        TreeNode c12 = new TreeNode(7);
        a12.left = c11;
        a12.right = c12;

        int flag1 = maxDepth(a1);
        System.out.println(flag1);



        TreeNode b1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(2);
        TreeNode a3 = new TreeNode(3);
        TreeNode a4 = new TreeNode(4);
        TreeNode a5 = new TreeNode(5);
        b1.left = a2;
        a2.left = a3;
        a3.left = a4;
        a4.left = a5;
        int flag2 = maxDepth(b1);
        System.out.println(flag2);
    }
}
