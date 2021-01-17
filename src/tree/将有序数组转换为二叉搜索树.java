package tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author Natasha
 * @Description
 * @Date 2021/1/13 17:28
 **/
public class 将有序数组转换为二叉搜索树 {
    public static TreeNode sortedArrayToBST(int[] nums) {
        return sortedNode(0, nums.length - 1, nums);
    }
    public static TreeNode sortedNode(int low, int high, int[] nums){
        if(high < low){
            return null;
        }
        int mid = low + (high - low) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = sortedNode(low, mid - 1, nums);
        node.right = sortedNode(mid + 1, high, nums);
        return node;
    }
    public static void main(String[] args) {
        TreeNode node = sortedArrayToBST(new int[]{-10,-3,0,5,9});
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        System.out.println("[ "+ node.val+"]");
        while(queue.size() != 0){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode tn = queue.poll();
                if(tn.left != null){
                    queue.add(tn.left);
                    System.out.printf("["+ tn.left.val+", ");
                }else if(tn.left == null){
                    System.out.printf("[null, ");
                }
                if(tn.right != null){
                    queue.add(tn.right);
                    System.out.printf(tn.right.val+"]");
                }else if(tn.right == null){
                    System.out.printf("null]");
                }
            }
            System.out.println();
        }
    }
}
