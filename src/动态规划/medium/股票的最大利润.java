package 动态规划.medium;

/**
 * @Author Natasha
 * @Description
 * @Date 2021/2/1 16:52
 **/
public class 股票的最大利润 {
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        if(n == 0){
            return 0;
        }
        int[] dp = new int[2];
        dp[1] = prices[0];
        for (int i = 1; i < n; i++) {
            if(prices[i] > dp[1]){
                dp[0] = Math.max(dp[0], prices[i] - dp[1]);
            }
            dp[1] = Math.min(dp[1], prices[i]);
        }
        return dp[0];
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{2,4,1}));
    }
}
