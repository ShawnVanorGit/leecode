package 贪心算法;

/**
 * @Author Natasha
 * @Description
 * 长为2 ， 1 * 1, dp[1] * 1,
 * 长为3 ， 2 * 1, dp[2] * 1,
 * 长为4 ， 3 * 1, dp[3] * 1, 除了直接分为3段和1段，还可以拿3段再去细分，两者比乘积大小
 *         2 * 2, dp[2] * 2, 除了直接分为2段和2段，还可以拿2段再去细分，两者比乘积大小
 * @Date 2021/2/2 9:10
 **/
public class 剪绳子II {
    //解答错误，请用贪心
    public static int cuttingRope(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i], Math.max((i - j) * j, dp[i - j] * j));
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(cuttingRope(3));
    }
}
