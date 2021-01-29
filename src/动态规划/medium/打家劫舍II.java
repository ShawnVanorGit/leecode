package 动态规划.medium;

import java.util.Arrays;

/**
 * @Author Natasha
 * @Description 其实就是把环拆成两个队列，一个是从0到n-1，另一个是从1到n，然后返回两个结果最大的。
 * @Date 2021/1/29 9:05
 **/
public class 打家劫舍II {
    public static int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return nums[0];
        }
        return Math.max(my_rob(Arrays.copyOfRange(nums, 0, n - 1)),
                my_rob(Arrays.copyOfRange(nums, 1, n)));
    }

    public static int my_rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 2; i <= n; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i - 1], dp[i - 1]);
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(rob(new int[]{0}));
    }
}
