package tree;

/**
 * @Author Natasha
 * @Description
 * @Date 2021/1/13 11:47
 **/
public class 对称二叉树 {
    public static boolean isSymmetric(TreeNode root) {
        return isSymmetrics(root, root);
    }
    public static boolean isSymmetrics(TreeNode left, TreeNode right) {
        if(left == null && right == null){
            return true;
        } else if(left == null || right == null){
            return false;
        } else if(left.val != right.val){
            return false;
        } else  if(left.val == right.val){
            return isSymmetrics(left.left, right.right) && isSymmetrics(left.right, right.left);
        }
        return false;
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(1);
        TreeNode a11 = new TreeNode(2);
        TreeNode a12 = new TreeNode(2);
        a1.left = a11;
//        TreeNode b11 = new TreeNode(3);
        TreeNode b12 = new TreeNode(3);
//        a11.left = b11;
        a11.right = b12;

        a1.right = a12;
//        TreeNode c11 = new TreeNode(4);
        TreeNode c12 = new TreeNode(3);
//        a12.left = c11;
        a12.right = c12;

        boolean flag = isSymmetric(a1);
        System.out.println(flag);
    }
}
