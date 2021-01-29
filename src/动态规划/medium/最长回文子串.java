package 动态规划.medium;

/**
 * @Author Natasha
 * @Description
 * 因为只能从上面或左边走过来，所以递推公式是 dp[i][j]=dp[i-1][j]+dp[i][j-1]。
 * dp[i-1][j]表示的是从上面走过来的路径条数。
 * dp[i][j-1]表示的是从左边走过来的路径条数。
 * 边界：注意dp[i - 1][j + 1]要构成区间，因为区间的长度等于2或3时，我们只需要关注首尾字符是否相等
 * https://leetcode-cn.com/problems/unique-paths/solution/xiao-xue-ti-java-by-biyu_leetcode/
 * https://leetcode-cn.com/problems/unique-paths/solution/dong-tai-gui-hua-di-gui-gong-shi-deng-3z-9mp1/
 * @Date 2021/1/22 20:38
 **/
public class 最长回文子串 {
    public String longestPalindrome(String s) {
        int n = s.length();
        char[] c = s.toCharArray();
        int maxRes = 1;
        int begin = 0;
        boolean[][] dp = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }
        for (int j = 1; j < n; j++) {
            for (int i = 0; i < j; i++) {
                if(c[i] != c[j]){
                    dp[i][j] = false;
                }else{
                    if(j - i < 3){
                        dp[i][j] = true;
                    }else{
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }
                if(dp[i][j] && j - i + 1 > maxRes){
                    maxRes = j - i + 1 ;
                    begin = i;
                }
            }
        }
        return s.substring(begin, begin + maxRes);
    }
}
