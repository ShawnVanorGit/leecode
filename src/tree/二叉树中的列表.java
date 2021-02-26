package tree;


/**
 * @Author Natasha
 * @Description
 * @Date 2021/2/26 7:59
 **/
public class 二叉树中的列表 {
    public boolean isSubPath(ListNode head, TreeNode root) {
        if (root == null) {
            return false;
        }
        return isSub(head, root) || isSubPath(head, root.left) || isSubPath(head, root.right);
    }

    public boolean isSub(ListNode head, TreeNode root) {
        if (head == null) {
            return true;
        }
        if (root == null) {
            return false;
        }
        if (head.val != root.val) {
            return false;
        }
        return isSub(head.next, root.left) || isSub(head.next, root.right);
    }
}
