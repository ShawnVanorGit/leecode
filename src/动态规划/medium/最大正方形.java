package 动态规划.medium;

/**
 * @Author Natasha
 * @Description
 * @Date 2021/2/19 8:33
 **/
public class 最大正方形 {
    public static int maximalSquare(char[][] matrix) {
        int x = matrix.length;
        int y = matrix[0].length;
        int[][] dp = new int[x][y];
        int res = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (matrix[i][j] == '1') {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
                    }
                    res = Math.max(dp[i][j], res);
                }

            }
        }
        return res * res;
    }

    public static void main(String[] args) {
        char[][] c = new char[][]{{'0', '1'}, {'1', '0'}};
        System.out.println(maximalSquare(c));
    }
}
