package tree;

/**
 * @Author Natasha
 * @Description
 * @Date 2021/1/15 13:39
 **/
public class 单值二叉树 {
    static boolean flag = true;

    public static boolean isUnivalTree(TreeNode root) {
        isUnivalTreeNode(root, root.val);
        return flag;
    }

    public static void isUnivalTreeNode(TreeNode root, int val) {
        if (root == null) {
            return;
        }
        if (root.val != val) {
            flag = false;
        }
        if (root != null) {
            isUnivalTreeNode(root.left, val);
            isUnivalTreeNode(root.right, val);
        }
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(1);
        TreeNode a11 = new TreeNode(1);
        TreeNode a12 = new TreeNode(1);
        a1.left = a11;
        a1.right = a12;
        TreeNode b11 = new TreeNode(1);
        TreeNode b12 = new TreeNode(1);
        a11.left = b11;
        a11.right = b12;
        TreeNode c = new TreeNode(1);
        a12.right = c;
        System.out.println(isUnivalTree(a1));
    }
}
