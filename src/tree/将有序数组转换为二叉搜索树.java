package tree;

public class 将有序数组转换为二叉搜索树 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedNode(0, nums.length - 1, nums);
    }
    public TreeNode sortedNode(int low, int high, int[] nums){
        if(high < low){
            return null;
        }
        int mid = low + (high - low) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = sortedNode(low, mid - 1, nums);
        node.right = sortedNode(mid + 1, high, nums);
        return node;
    }
}
