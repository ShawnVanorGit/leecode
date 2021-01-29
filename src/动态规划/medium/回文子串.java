package 动态规划.medium;

/**
 * @Author Natasha
 * @Description
 * @Date 2021/1/29 16:44
 **/
public class 回文子串 {
    public static int countSubstrings(String s) {
        int n = s.length();
        int cnt = 0;
        boolean[][] dp = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
            cnt++;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) != s.charAt(i)) {
                    dp[i][j] = false;
                } else if (i - j <= 2) {
                    dp[i][j] = true;
                    cnt++;
                } else {
                    dp[i][j] = dp[i - 1][j + 1];
                    if (dp[i][j]) {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(countSubstrings("aaa"));
    }
}
