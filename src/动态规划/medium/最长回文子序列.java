package 动态规划.medium;

/**
 * @Author Natasha
 * @Description dp[i][j] = dp[i + 1][j - 1] + 2;
 * 这里的+2是因为求得是回文串，所以首尾相等就+2
 * 这道题就两方面补充完整思路，一个是依次（可以左到右或者右到左）判断出最大的回文串子序列；二是利用填表法思考出状态转移方程
 * @Date 2021/2/8 14:02
 **/
public class 最长回文子序列 {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for (int i = n - 1; i >= 0; i--) {
            dp[i][i] = 1;
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[0][n - 1];
    }
}
