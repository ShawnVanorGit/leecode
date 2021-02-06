package 动态规划.medium;

import java.util.Arrays;

/**
 * @Author Natasha
 * @Description 跟剪绳子是一样的
 * 当amount = 11，
 * 可能有dp[11-1]，dp[11-2]，dp[11-5]求最优
 * @Date 2021/1/25 9:31
 **/
public class 零钱兑换 {
    public static int coinChange(int[] coins, int amount) {
        int tmp = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, tmp);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if(i - coin >= 0){
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[amount] == tmp ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        System.out.println(coinChange(new int[]{2}, 3));
    }
}
