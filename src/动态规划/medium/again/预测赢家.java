package 动态规划.medium.again;

/**
 * @Author Natasha
 * @Description 需要理解的是 每次都是 甲对乙 取完 最优净得分 后的dp，再用 Math.max()比较取首尾哪边获利更大
 * dp表示甲对乙的的净得分
 * dp[0][n-1]表示从区间[0,n]甲对乙最终的净得分
 * 举例：[1,5,2] i = 0, j = 2
 *      dp[0][2] = Math.max(num[0]-dp[1][2], num[2]-dp[0][1])=Math.max(1-[5,2], 2-[1,5]);
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
        System.out.println(PredictTheWinner(new int[]{1, 5, 2}));
    }
}
