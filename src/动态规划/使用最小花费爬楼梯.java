package 动态规划;

/**
 * @Author Natasha
 * @Description
 * @Date 2021/1/19 10:02
 **/
public class 使用最小花费爬楼梯 {
    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = cost[0];
        for (int i = 2; i <= n; i++) {
            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i - 1];
        }
        return Math.min(dp[n - 1], dp[n]);
    }

    public static void main(String[] args) {
        System.out.println(minCostClimbingStairs(new int[]{10, 15, 20}));
    }
}
