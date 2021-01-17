package tree.again;
/**
 * @Author Natasha
 * @Description 似乎这种返回树本身，或者是一串接一串的return root，我还是不太熟悉
 * @Date 2021/1/15 14:38
 **/
public class 修剪二叉搜索树 {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root == null){
            return null;
        }
        if(root.val < low){
            return trimBST(root.right, low, high);
        }else if(root.val > high){
            return trimBST(root.left, low, high);
        }
        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);
        return root;
    }
}
