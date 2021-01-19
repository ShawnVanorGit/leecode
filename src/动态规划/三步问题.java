package 动态规划;

/**
 * @Author Natasha
 * @Description
 * @Date 2021/1/19 10:37
 **/
public class 三步问题 {
    public static int waysToStep(int n) {
        if(n < 3){
            return n;
        }
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = ((dp[i - 1] + dp[i - 2]) % 1000000007 + dp[i - 3]) % 1000000007;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(waysToStep(61));
    }
}
