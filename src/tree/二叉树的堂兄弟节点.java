package tree;

/**
 * @Author Natasha
 * @Description
 * @Date 2021/1/15 14:50
 **/
public class 二叉树的堂兄弟节点 {
    static TreeNode xparent;
    static int xdeep = 0;
    public static boolean isCousins(TreeNode root, int x, int y) {
        isCousinsTree(root, null, x, 0);
        TreeNode parent = xparent;
        int deep = xdeep;
        isCousinsTree(root, null, y, 0);
        if(parent != xparent && deep == xdeep){
            return true;
        }
        return false;
    }
    public static void isCousinsTree(TreeNode root, TreeNode pre, int z, int deep) {
        if(root == null){
            return ;
        }
        isCousinsTree(root.left, root, z, deep + 1);
        isCousinsTree(root.right, root, z,deep + 1);
        if(root.val == z){
            xparent = pre;
            xdeep = deep;
        }
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(1);
        TreeNode a11 = new TreeNode(2);
        TreeNode a12 = new TreeNode(3);
        a1.left = a11;
        a1.right = a12;
        TreeNode c = new TreeNode(4);
        a11.left = c;
        System.out.println(isCousins(a1,4,3));
    }
}
