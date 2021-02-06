package 动态规划.medium;

/**
 * @Author Natasha
 * @Description dp[i] = i,这里的+1就是j*j，最优解在i-j的平方后求得
 * 拿12举例,我们只能观察：
 * 12 = 1 + 11
 * 12 = 4 + 8
 * 12 = 9 + 3
 * 我们要得出3，8，11中谁的解最优，那么12的解就是它+1。
 * @Date 2021/2/1 13:43
 **/
public class 完全平方数 {
    public static int numSquares(int n) {
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i] = i;
            for (int j = 1; i - j * j >= 0; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(numSquares(5));
    }
}
