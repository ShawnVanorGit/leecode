package tree;
/**
 * @Author Natasha
 * @Description 记住中序遍历，是先前->中->后
 * @Date 2021/1/15 14:38
 **/
public class 二叉搜索树节点最小距离 {
    static TreeNode pre;
    static int min = Integer.MAX_VALUE;
    public static int minDiffInBST(TreeNode root) {
        minDiffInBSTTree(root);
        return min;
    }

    public static void minDiffInBSTTree(TreeNode root) {
        if(root == null){
            return;
        }
        minDiffInBSTTree(root.left);
        if(pre != null){
            min = Math.min(root.val - pre.val, min);
        }
        pre = root;
        minDiffInBSTTree(root.right);
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(4);
        TreeNode a11 = new TreeNode(2);
        TreeNode a12 = new TreeNode(6);
        a1.left = a11;
        a1.right = a12;
        TreeNode b11 = new TreeNode(1);
        TreeNode b12 = new TreeNode(3);
        a11.left = b11;
        a11.right = b12;
        System.out.println(minDiffInBST(a1));
    }
}
