package 动态规划.medium.again;
/*
dp[i][j]表示可以容纳最多字符串的数量
对于第一个01串 ‘10’：
可容纳的背包 （√表示可容纳 x表示不可容纳）
dp   0列    1列       2列     3列
0行   ×      ×       ×      ×
1行   ×      √       √      √
2行   ×      √       √      √
3行   ×      √       √      √
4行   ×      √       √      √
5行   ×      √       √      √

dp   0列    1列     2列     3列
0行   0      0       0      0
1行   0      1       1      1
2行   0      1       1      1
3行   0      1       1      1
4行   0      1       1      1
5行   0      1       1      1

投影到一维表格的时候，正向赋值还是反向赋值完全由状态转移方程决定。
投影到二维表格的时候：
状态转移方程参考的是二维表格里上一行的值，从前向后赋值，新的值会覆盖旧的值；
dp[2][2] = Math.max(dp[2][2], 1+ dp[1][1])
dp[3][3] = Math.max(dp[3][3], 1+ dp[2][2])//此时原来旧的dp[2][2]已被覆盖，我们dp[3][3]用的是新dp[2][2]的值。
如果从后向前赋值的，新的值还能够参考到原来旧的值，原来的旧值没有被覆盖，能保证状态转移正确。
dp[3][3] = Math.max(dp[3][3], 1+ dp[2][2])
dp[2][2] = Math.max(dp[2][2], 1+ dp[1][1])//旧的dp[2][2]值未被覆盖
*/

/**
 * @Author Natasha
 * @Description
 * @Date 2021/2/22 8:13
 **/
public class 一和零 {
    public static int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        dp[0][0] = 0;
        for (String str : strs) {
            int[] res = strToCharArray(str);
            int zero = res[0];
            int one = res[1];
            for (int i = m; i >= zero; i--) {
                for (int j = n; j >= one; j--) {
                    dp[i][j] =  1 + dp[i - zero][j - one];
                }
            }
        }
        return dp[m][n];
    }

    public static int[] strToCharArray(String s) {
        int[] res = new int[2];
        for (char c : s.toCharArray()) {
            res[c - '0']++;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(findMaxForm(new String[]{"11111","100","1101","1101","11000"}, 5, 7));
    }
}
