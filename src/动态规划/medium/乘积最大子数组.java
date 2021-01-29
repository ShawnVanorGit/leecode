package 动态规划.medium;

/**
 * @Author Natasha
 * @Description 当前值只参考了上一行的值，因此在填表的过程中，表格可以复用
 * @Date 2021/1/26 8:15
 **/
public class 乘积最大子数组 {
    public static int maxProduct(int[] nums) {
        int max = 1;
        int min = 1;
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < 0){
                int tmp = max;
                max = min;
                min = tmp;
            }
            max = Math.max(nums[i], max * nums[i]);
            min = Math.min(nums[i], min * nums[i]);
            res = Math.max(res, max);
        }
        return res;
    }

    public static void main(String[] args) {
        maxProduct(new int[]{-4,-3,-2});
    }
}
