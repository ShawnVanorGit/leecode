package tree;

/**
 * @Author Natasha
 * @Description
 * @Date 2021/1/14 16:58
 **/
public class 另一个树的子树 {
    public static boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null){
            return false;
        }
        return isSubtreeTree(s, t) || isSubtree(s.left, t) || isSubtree(s.right, t);
    }
    public static boolean isSubtreeTree(TreeNode s, TreeNode t) {
        if(s == null && t == null){
            return true;
        }else if(s == null || t == null){
            return false;
        } else if(s.val == t.val){
            return isSubtreeTree(s.left, t.left) && isSubtreeTree(s.right, t.right);
        }
        return false;
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(3);
        TreeNode a11 = new TreeNode(4);
        TreeNode a12 = new TreeNode(5);
        a1.left = a11;
        a1.right = a12;
        TreeNode d11 = new TreeNode(1);
        TreeNode d12 = new TreeNode(2);
        TreeNode q = new TreeNode(3);
        a12.left =d11;
        a12.right =d12;
        d12.left =q;
        TreeNode f = new TreeNode(5);
        TreeNode c11 = new TreeNode(1);
        TreeNode c12 = new TreeNode(2);
        f.left = c11;
        f.right = c12;

        boolean flag1 = isSubtree(a1, f);
        System.out.println(flag1);
    }
}
