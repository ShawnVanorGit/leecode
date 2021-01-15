package tree.unknow;

/**
 * @Author Natasha
 * @Description
 * @Date 2021/1/14 10:51
 **/
public class 二叉搜索树的最近公共祖先_使用迭代优化 {
    //方法一：
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val > q.val) {
            TreeNode tmp = p;
            p = q;
            q = tmp;
        }
        if (root.val <= q.val && root.val >= p.val) {
            return root;
        } else if (root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else {
            return lowestCommonAncestor(root.right, p, q);
        }
    }
    //方法二：
    public static TreeNode lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val > q.val && root.val > p.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (root.val < q.val && root.val < p.val) {
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }


    public static void main(String[] args) {
//        TreeNode a1 = new TreeNode(6);
//        TreeNode a11 = new TreeNode(2);
//        TreeNode a12 = new TreeNode(8);
//        a1.left = a11;
//        a1.right = a12;
//        TreeNode e11 = new TreeNode(0);
//        TreeNode e12 = new TreeNode(4);
//        a11.left = e11;
//        a11.right = e12;
//        TreeNode f11 = new TreeNode(7);
//        TreeNode f12 = new TreeNode(9);
//        a12.left = f11;
//        a12.right = f12;
//        TreeNode c11 = new TreeNode(3);
//        TreeNode c12 = new TreeNode(5);
//        e12.left = c11;
//        e12.right = c12;

        TreeNode a1 = new TreeNode(2);
        TreeNode a11 = new TreeNode(1);
        a1.left = a11;
        TreeNode node = lowestCommonAncestor(a1, new TreeNode(2), new TreeNode(1));
        System.out.println(node.val);
    }
}
