package 动态规划.medium;


/**
 * @Author Natasha
 * @Description 尽可能使用大区间去匹配
 * @Date 2021/2/9 14:46
 **/
public class 视频拼接 {
    public static int videoStitching(int[][] clips, int T) {
        int[] dp = new int[T + 1];
        dp[0] = 0;
        for (int i = 1; i <= T; i++) {
            dp[i] = Integer.MAX_VALUE - 1;
            for (int[] clip : clips) {
                if (clip[0] < i && i <= clip[1]) {
                    dp[i] = Math.min(dp[i], dp[clip[0]] + 1);
                }
            }
        }
        return dp[T] == Integer.MAX_VALUE - 1 ? -1 : dp[T];
    }

    public static void main(String[] args) {
        System.out.println(videoStitching(new int[][]{{0, 2}, {4, 8}}, 5));
    }
}
