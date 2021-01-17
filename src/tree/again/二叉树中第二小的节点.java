package tree.again;

/**
 * @Author Natasha
 * @Description 注意临界值
 * @Date 2021/1/15 8:55
 **/
public class 二叉树中第二小的节点 {
    static int min = Integer.MAX_VALUE;
    static int max = -1;
    static int cnt = 0;
    public static int findSecondMinimumValue(TreeNode root) {
        findTargetTree(root);
        return max;
    }
    public static void findTargetTree(TreeNode root) {
        if(root == null){
            return;
        }
        if(root.val < min){
            max = min;
            min = root.val;
        }else if(root.val <= max && root.val > min){
            cnt++;
            max = root.val;
        }
        findTargetTree(root.left);
        findTargetTree(root.right);
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(2);
        TreeNode a11 = new TreeNode(2);
        TreeNode a12 = new TreeNode(5);
        a1.left = a11;
        a1.right = a12;
        TreeNode b11 = new TreeNode(5);
        TreeNode b12 = new TreeNode(7);
        a12.left = b11;
        a12.right =b12;
        int flag = findSecondMinimumValue(a1);
        System.out.println(flag);
    }
}
