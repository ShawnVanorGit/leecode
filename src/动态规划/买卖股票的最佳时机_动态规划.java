package 动态规划;

/**
 * @Author Natasha
 * @Description
 * @Date 2021/1/18 17:05
 **/
public class 买卖股票的最佳时机_动态规划 {
    public int maxProfit(int[] prices) {
        int[] dp = new int[2];
        //不持有
        dp[0] = 0;
        //持有
        dp[1] = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if(prices[i] > dp[1]){
                dp[0] = Math.max(dp[0], prices[i] - dp[1]);
            }
            dp[1] = Math.min(dp[1], prices[i]);
        }
        return dp[0];
    }
}
