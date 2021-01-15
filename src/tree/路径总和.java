package tree;

/**
 * @Author Natasha
 * @Description
 * @Date 2021/1/14 9:54
 **/
public class 路径总和 {
    //方法一：
    public static boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return sum == root.val;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
    //方法二：
    static boolean flag = false;
    public static boolean hasPathSum1(TreeNode root, int sum) {
        if(root == null){
            return flag;
        }
        hasPathSumNode(root, 0 , sum);
        return flag;
    }
    public static void hasPathSumNode(TreeNode root, int tmp, int sum) {
        tmp += root.val;
        if(root.left == null && root.right == null){
            if(tmp == sum){
                flag = true;
            }
        }
        if(root.left != null){
            hasPathSumNode(root.left, tmp, sum);
        }
        if(root.right != null){
            hasPathSumNode(root.right, tmp, sum);
        }
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(5);
        TreeNode a11 = new TreeNode(4);
        TreeNode a12 = new TreeNode(8);
        a.left = a11;
        a.right = a12;

        TreeNode c11 = new TreeNode(13);
        TreeNode c12 = new TreeNode(4);
        a12.left = c11;
        a12.right = c12;
        TreeNode e = new TreeNode(1);
        c12.right = e;

        TreeNode d = new TreeNode(11);
        TreeNode d11 = new TreeNode(7);
        TreeNode d12 = new TreeNode(2);
        a11.left = d;
        d.left = d11;
        d.right = d12;
        boolean flag = hasPathSum1(a, 22);
        System.out.println(flag);
    }
}
