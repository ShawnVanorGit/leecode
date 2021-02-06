package 动态规划.medium;

import java.util.Arrays;

/**
 * @Author Natasha
 * @Description
 * 当 i= 10，coin=5
 * dp[i - coin]=dp[10-5]=dp[5]，求的是1+dp[5](这里的1+是把coin=5当做一种情况了）的可能计数
 * 5=5
 * 5=1+1+1+1+1
 *
 * 10=5+(5=5)
 * 10=5+(5=1+1+1+1+1)买卖股票的最佳时机含手续费
 * @Date 2021/2/2 9:39
 **/
public class 硬币 {
    public static int waysToChange(int n) {
        int[] coins = new int[]{1, 5, 10, 25};
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int i = 1; i <= n; i++) {
                if (i - coin >= 0) {
                    dp[i] = (dp[i] + dp[i - coin]) % 1000000007;
                }
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(waysToChange(10));
    }
}
