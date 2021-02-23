package 动态规划.medium.again;

/**
 * @Author Natasha dp表示在给出区间[6,3,4,5]中，"亚历克斯"最多可以赢"李"的分数
    举例[6,3,4,5]（根据状态转移方程计算状态的时候，一定要保证左边一格和下边一格的值先计算出来。）
        在区间[4,5],dp[2][3]中"亚历克斯"取5，那最多可以赢"李"1分
        在区间[3,4],dp[1][2]中"亚历克斯"取4，那最多可以赢"李"1分
        在区间[3,4,5],dp[1][3]中"亚历克斯"取5，"李"取4，"亚历克斯"取3，(在这个过程中有重复计算存在，故使用动态规划)那最多可以赢"李"4分
    ...
 * @Date 2021/2/9 10:00
 **/
public class 预测赢家 {
    public static boolean PredictTheWinner(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n];
        for (int i = n - 1; i >= 0; i--) {
            dp[i][i] = nums[i];
            for (int j = i + 1; j < n; j++) {
                dp[i][j] = Math.max(nums[i] - dp[i + 1][j], nums[j] - dp[i][j - 1]);
            }
        }
        return dp[0][n - 1] >= 0;
    }

    public static void main(String[] args) {
        System.out.println(PredictTheWinner(new int[]{6,3,4,5}));
    }
}
