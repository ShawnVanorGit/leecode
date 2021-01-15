package tree;

/**
 * @Author Natasha
 * @Description
 * @Date 2021/1/14 8:34
 **/
public class 二叉树的最小深度 {
    public static int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        else {
            int left1 = minDepth(root.left);
            int right1 = minDepth(root.right);
            return root.left == null || root.right == null ? right1 + left1 + 1 : Math.min(left1, right1) + 1;
        }
    }
    public static void main(String[] args) {
//        TreeNode a = new TreeNode(2);
//        TreeNode b = new TreeNode(3);
//        TreeNode c = new TreeNode(4);
//
//        TreeNode d = new TreeNode(5);
//        TreeNode e = new TreeNode(6);
//        a.left = b;
//        b.left = c;
//        c.left = d;
//        d.left = e;
//
//        int flag1 = minDepth(a);
//        System.out.println(flag1);

        TreeNode a1 = new TreeNode(1);
        TreeNode a11 = new TreeNode(9);
        TreeNode a12 = new TreeNode(20);
        a1.left = a11;
        a1.right = a12;
        TreeNode c11 = new TreeNode(15);
        TreeNode c12 = new TreeNode(7);
        a12.left = c11;
        a12.right = c12;

        int flag1 = minDepth(a1);
        System.out.println(flag1);
    }
}
