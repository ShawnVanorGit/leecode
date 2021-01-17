package tree;
/**
 * @Author Natasha
 * @Description 如果二进制用new StringBuilder()开销大,所以老老实实用*2更适合
 * @Date 2021/1/15 14:38
 **/
public class 从根到叶的二进制数之和 {
    static int ans;
    public static int sumRootToLeaf(TreeNode root) {
        sumbinary(root, 0);
        return ans;
    }

    public static void sumbinary(TreeNode root, int cur){
        if(root == null){
            return;
        }
        cur = cur * 2 + root.val;
        if(root.left == null && root.right == null){
            ans += cur;
            return;
        }
        sumbinary(root.left, cur);
        sumbinary(root.right, cur);
    }

//    static List<Integer> list = new ArrayList<>();
//    public static int sumRootToLeaf(TreeNode root) {
//        int sum = 0;
//        sumRootToLeafTree(root, new StringBuilder());
//        for (int i = 0; i < list.size(); i++) {
//            sum += list.get(i);
//        }
//        return sum;
//    }
//    public static void sumRootToLeafTree(TreeNode root, StringBuilder sb) {
//        if(root == null){
//            return;
//        }
//        sb.append(root.val);
//        if(root.left == null && root.right == null){
//            list.add(Integer.parseInt(sb.toString(), 2));
//            return;
//        }
//        if(root.left != null){
//            sumRootToLeafTree(root.left, new StringBuilder(sb));
//        }
//        if(root.right != null){
//            sumRootToLeafTree(root.right, new StringBuilder(sb));
//        }
//    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(1);
        TreeNode a11 = new TreeNode(0);
        TreeNode a12 = new TreeNode(1);
        a1.left = a11;
        a1.right = a12;
        TreeNode c11 = new TreeNode(0);
        TreeNode c12 = new TreeNode(1);
        a11.left = c11;
        a11.right = c12;
        TreeNode b11 = new TreeNode(0);
        TreeNode b12 = new TreeNode(1);
        a12.left = b11;
        a12.right = b12;
        System.out.println(sumRootToLeaf(a1));
    }
}
