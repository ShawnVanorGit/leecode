package 动态规划.medium.again;

/**
 * @Author Natasha
 * @Description
 * 我们用 dp[i]表示第 i 天结束之后的「累计最大收益」,因此根据题目描述我们会有三种不同的状态：
 *         1.我们目前持有一支股票，对应的「累计最大收益」记为 dp[i][0]
 *         2.我们目前不持有任何股票，并且处于冷冻期中，对应的「累计最大收益」记为 dp[i][1]
 *         3.我们目前不持有任何股票，并且不处于冷冻期中，对应的「累计最大收益」记为 dp[i][2]
 * @Date 2021/2/5 15:28
 **/

public class 最佳买卖股票时机含冷冻期 {
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        if (n == 0) {
            return n;
        }
        int[][] dp = new int[n][3];
        dp[0][0] = -prices[0];
        for (int i = 1; i < n; i++) {
            // f[i][0]: 手上持有股票的最大收益
            // 可能结果：前一次手上持有股票的最大收益 & 前一次手上不持有股票的非冷冻期+买入当前股票
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][2] - prices[i]);
            // f[i][1]:手上不持有股票的冷冻期
            // 可能结果：前一次手上持有股票的非冷冻期+买入当前股票
            dp[i][1] = dp[i - 1][0] + prices[i];
            // f[i][2]:手上不持有股票的非冷冻期
            // 可能结果：前一次手上不持有股票的非冷冻期 & 前一次手上不能有股票的冷冻期
            dp[i][2] = Math.max(dp[i - 1][2], dp[i - 1][1]);
        }
        return Math.max(dp[n - 1][1], dp[n - 1][2]);
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{1, 2, 3, 0, 2}));
    }
}
