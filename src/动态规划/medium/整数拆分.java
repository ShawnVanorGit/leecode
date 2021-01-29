package 动态规划.medium;

/**
 * @Author Natasha
 * @Description 整数n可以拆分成至少两个数之和，比如是k，那另一个是n-k。n-k还可以继续往下拆，于是根据动态规划的思想，我们可以得到n的最大乘积。
 * @Date 2021/1/28 14:14
 **/
public class 整数拆分 {
    public static int integerBreak(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i], Math.max(j * (i - j), j * dp[i - j]));
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(integerBreak(3));
    }
}
