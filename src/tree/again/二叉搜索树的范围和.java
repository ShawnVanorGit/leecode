package tree.again;
/**
 * @Author Natasha
 * @Description 利用BST特性
 * @Date 2021/1/15 13:47
 **/
public class 二叉搜索树的范围和 {
    public static int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null){
            return 0;
        }
        if(root.val > high){
            return rangeSumBST(root.left, low, high);
        }
        if(root.val < low){
            return rangeSumBST(root.right, low, high);
        }
        return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
    }

/*
    static int num = 0;
    public static int rangeSumBST(TreeNode root, int low, int high) {
        rangeSumBSTNode(root, low, high);
        return num;
    }

    public static void rangeSumBSTNode(TreeNode root, int low, int high) {
        if(root == null){
            return ;
        }
        if(root.val >= low && root.val <= high){
            num += root.val;
        }
        rangeSumBSTNode(root.left, low, high);
        rangeSumBSTNode(root.right, low, high);
    }
*/

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(10);
        TreeNode a11 = new TreeNode(5);
        TreeNode a12 = new TreeNode(15);
        a1.left = a11;
        a1.right = a12;
        TreeNode b11 = new TreeNode(3);
        TreeNode b12 = new TreeNode(7);
        a11.left = b11;
        a11.right = b12;
        TreeNode c = new TreeNode(18);
        a12.right = c;
        System.out.println(rangeSumBST(a1, 7, 15));
    }
}
