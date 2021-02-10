package 动态规划.medium;

/**
 * @Author Natasha
 * @Description 动态规划的三步骤
 * 1.确定dp求解的是什么:dp[i]为到第i天的最低总票价
 * 2.dp初始化：dp[0]=0
 * 3.dp状态转移
 * @Date 2021/2/10 14:35
 **/
public class 最低票价 {
    public static int mincostTickets(int[] days, int[] costs) {
        int n = days.length;
        if (n == 0 || costs.length == 0) {
            return 0;
        }
        //虽然days是区间{1, 4, 6, 7, 8, 20}，但我们这里设置从1到10
        int lastday = days[n - 1] + 1;
        int[] dp = new int[lastday];
        //base case
        dp[0] = 0;
        //标记需要买票的days为最大值
        for (int day : days) {
            dp[day] = Integer.MAX_VALUE;
        }
        for (int i = 1; i < lastday; i++) {
            //如果当天不在日程上不需要买票，则取前一天的dp,并且跳过此次循环
            if (dp[i] == 0) {
                dp[i] = dp[i - 1];
                continue;
            }
            int j1 = dp[i - 1] + costs[0];
            //if 距离第一天买票已经过了7天，则取前七天花费买票的钱+买七天票的钱
            //else 直接就买七日票
            int j7 = i > 7 ? dp[i - 7] + costs[1] : costs[1];
            //30天同理
            int j30 = i > 30 ? dp[i - 30] + costs[2] : costs[2];
            dp[i] = Math.min(j30, Math.min(j1, j7));
        }
        return dp[lastday - 1];
    }

    public static void main(String[] args) {
        System.out.println(mincostTickets(new int[]{1, 4, 6, 7, 8, 20}, new int[]{2, 7, 15}));
    }
}