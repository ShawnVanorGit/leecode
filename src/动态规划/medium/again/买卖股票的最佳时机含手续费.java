package 动态规划.medium.again;

/**
 * @Author Natasha
 * @Description dp[1] = Math.max(dp[1], dp[0] - prices[i]);
 * 其中的 dp[0] - prices[i], 不持有股票时手中已经存在利润-如果购买当前prices[i]后的所得，与持有股票时对比
 * @Date 2021/2/4 10:57
 **/
public class 买卖股票的最佳时机含手续费 {
    public static int maxProfit(int[] prices, int fee) {
        int[] dp = new int[2];
        dp[0] = 0;
        //持有
        dp[1] = -prices[0];
        for (int i = 2; i < prices.length; i++) {
            dp[0] = Math.max(dp[0], prices[i] + dp[1] - fee);
            dp[1] = Math.max(dp[1], dp[0] - prices[i]);
        }
        return dp[0];
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{1, 3, 2, 8, 4, 3, 9}, 2));
    }
}
