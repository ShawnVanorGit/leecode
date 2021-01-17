package tree;

/**
 * @Author Natasha
 * @Description
 * @Date 2021/1/14 13:40
 **/
public class 左叶子之和 {
    static int cnt = 0;
    public static int sumOfLeftLeaves(TreeNode root) {
        if(root == null){
            return cnt;
        }
        sumOfLeftLeavesNode(root, false);
        return cnt;
    }
    public static void sumOfLeftLeavesNode(TreeNode root, boolean flag) {
        if(root.left == null && root.right == null && flag){
            cnt += root.val;
            return ;
        }
        if(root.left != null){
            sumOfLeftLeavesNode(root.left, true);
        }
        if(root.right != null){
            sumOfLeftLeavesNode(root.right, false);
        }
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(3);
        TreeNode a11 = new TreeNode(9);
        TreeNode a12 = new TreeNode(20);
        a1.left = a11;
        a1.right = a12;
        TreeNode c11 = new TreeNode(15);
        TreeNode c12 = new TreeNode(7);
        a12.left = c11;
        a12.right = c12;

        int flag1 = sumOfLeftLeaves(a1);
        System.out.println(flag1);
    }
}
