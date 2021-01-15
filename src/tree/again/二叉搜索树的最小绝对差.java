package tree.again;

/**
 * @Author Natasha
 * @Description 中序遍历
 * @Date 2021/1/14 14:03
 **/
public class 二叉搜索树的最小绝对差 {
    static TreeNode pre;
    static int min1 = Integer.MAX_VALUE;
    public static int getMinimumDifference1(TreeNode root) {
        getMinimumDifferenceNode1(root);
        return min1;
    }
    public static void getMinimumDifferenceNode1(TreeNode root) {
        if(root == null){
            return ;
        }
        getMinimumDifferenceNode1(root.left);
        if(pre != null){
            min1 = Math.min(root.val - pre.val, min1);
        }
        pre = root;
        getMinimumDifferenceNode1(root.right);
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(236);
        TreeNode a12 = new TreeNode(104);
        TreeNode a11 = new TreeNode(701);

        a1.left = a12;
        a1.right = a11;
        TreeNode b = new TreeNode(227);
        a12.right = b;
        TreeNode c = new TreeNode(911);
        a11.right = c;
        int flag1 = getMinimumDifference1(a1);
        System.out.println(flag1);
    }
}
