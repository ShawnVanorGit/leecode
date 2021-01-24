package 动态规划.again;

/**
 * @Author Natasha
 * @Description 偷前k间房子的偷法,换个思路，从偷2间房子开始算起[2, 1]
 * @Date 2021/1/19 8:34
 **/
public class 打家劫舍 {
    public static int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
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
        System.out.println(rob(new int[]{2, 1, 1, 2}));
    }
}
