package 动态规划.medium;

/**
 * @Author Natasha
 * @Description
 * 最需要理解的是为啥当text1.charAt(i - 1) == text2.charAt(j - 1)时，dp[i][j] = dp[i - 1][j - 1] + 1;
 * 因为dp[i][0]和dp[0][j]初始化为边界都取0，所以对应当第一个字符i=0就是dp[1]的情况,第二个字符i=1就是dp[2]的情况
 * @Date 2021/2/6 8:11
 **/
public class 最长公共子序列 {
    public static int longestCommonSubsequence(String text1, String text2) {
        int a = text1.length();
        int b = text2.length();
        int[][] dp = new int[a + 1][b + 1];
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }else{
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[a][b];
    }

    public static void main(String[] args) {
        System.out.println(longestCommonSubsequence("abcde", "ace"));
    }
}
