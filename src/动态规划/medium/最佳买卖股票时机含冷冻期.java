package 动态规划.medium;

/**
 * @Author Natasha
 * @Description
 * @Date 2021/2/5 15:28
 **/
public class 最佳买卖股票时机含冷冻期 {
    public static int maxProfit(int[] prices) {
        int[] dp = new int[2];
        dp[0] = 0;
        dp[1] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp[0] = Math.max(dp[0], prices[i] + dp[1]);
            //只要在今天想买入的时候判断一下前一天是不是刚卖出，即可
            dp[1] = Math.max(dp[1], dp[0] - prices[i]);
        }
        return dp[0];
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{1, 2, 3, 0, 2}));
    }
}
