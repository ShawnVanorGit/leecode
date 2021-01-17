package tree;

public class 叶子相似的树 {
    static StringBuilder sb2 = new StringBuilder();

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        leafSimilarTree(root1);
        String sb1 = sb2.toString();
        sb2.setLength(0);
        leafSimilarTree(root2);

        if (sb1.equals(sb2.toString())) {
            return true;
        }
        return false;
    }

    public static void leafSimilarTree(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            sb2.append(root.val).append(",");
        }
        leafSimilarTree(root.left);
        leafSimilarTree(root.right);
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(3);
        TreeNode a11 = new TreeNode(5);
        TreeNode a12 = new TreeNode(1);
        a1.left = a11;
        a1.right = a12;
        TreeNode c11 = new TreeNode(6);
        TreeNode c12 = new TreeNode(71);
        a11.left = c11;
        a11.right = c12;
        TreeNode b11 = new TreeNode(4);
        TreeNode b12 = new TreeNode(2);
        a12.left = b11;
        a12.right = b12;
        TreeNode d11 = new TreeNode(9);
        TreeNode d12 = new TreeNode(8);
        b12.left = d11;
        b12.right = d12;

        TreeNode qa1 = new TreeNode(3);
        TreeNode qa11 = new TreeNode(5);
        TreeNode qa12 = new TreeNode(1);
        qa1.left = qa11;
        qa1.right = qa12;
        TreeNode qc11 = new TreeNode(6);
        TreeNode qc12 = new TreeNode(2);
        qa11.left = qc11;
        qa11.right = qc12;
        TreeNode qb11 = new TreeNode(7);
        TreeNode qb12 = new TreeNode(14);
        qc12.left = qb11;
        qc12.right = qb12;
        TreeNode qd11 = new TreeNode(9);
        TreeNode qd12 = new TreeNode(8);
        qa12.left = qd11;
        qa12.right = qd12;
        boolean flag1 = leafSimilar(a1, qa1);
        System.out.println(flag1);
    }
}