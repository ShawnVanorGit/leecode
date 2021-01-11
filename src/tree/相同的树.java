package tree;

public class 相同的树 {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        } else if (p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(1);
        TreeNode a11 = new TreeNode(2);
        TreeNode a12 = new TreeNode(3);
        a1.left = a11;
        a1.right = a12;

        TreeNode A1 = new TreeNode(1);
        TreeNode A11 = new TreeNode(2);
        TreeNode A12 = new TreeNode(3);
        A1.left = A11;
        A1.right = A12;

        boolean flag = isSameTree(a1, A1);
        System.out.println(flag);
    }
}
