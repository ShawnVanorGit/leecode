package 动态规划.medium;

/**
 * @Author Natasha
 * @Description dp[i]会在第二次循环，所以需要与自已做max判断
 * @Date 2021/1/26 12:07
 **/
public class 剪绳子 {
    public static int cuttingRope(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i], Math.max((i - j) * j, dp[i - j] * j));
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(cuttingRope(10));
    }
}
