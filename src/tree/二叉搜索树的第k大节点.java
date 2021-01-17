package tree;

/**
 * @Author Natasha
 * @Description
 * @Date 2021/1/15 14:38
 **/
public class 二叉搜索树的第k大节点 {
    static int kt = 0;
    static int res = 0;
    public static int kthLargest(TreeNode root, int k) {
        kthLargestTree(root, k);
        return res;
    }
    public static void kthLargestTree(TreeNode root, int k) {
        if(root == null){
            return ;
        }
        kthLargest(root.right, k);
        kt++;
        if(kt == k){
            res = root.val;
        }
        kthLargest(root.left, k);

    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(5);
        TreeNode a11 = new TreeNode(3);
        TreeNode a12 = new TreeNode(6);
        a1.left = a11;
        a1.right = a12;
        TreeNode b11 = new TreeNode(2);
        TreeNode b12 = new TreeNode(4);
        a11.left = b11;
        a11.right = b12;
        TreeNode c = new TreeNode(1);
        b11.left = c;
        int flag1 = kthLargest(a1, 3);
        System.out.println(flag1);
    }
}
