package 动态规划.medium;

/**
 * @Author Natasha
 * @Description
 * @Date 2021/2/25 8:09
 **/
public class 最长湍流子数组 {
    public static int maxTurbulenceSize(int[] arr) {
        int n = arr.length;
        int[][] dp = new int[2][n];
        dp[0][0] = dp[1][0] = 1;
        int res = 1;
        for (int i = 1; i < n; i++) {
            dp[0][i] = dp[1][i] = 1;
            if (arr[i - 1] > arr[i]) {
                dp[0][i] = dp[1][i - 1] + 1;
            } else if(arr[i - 1] < arr[i]){
                dp[1][i] = dp[0][i - 1] + 1;
            }
        }
        for (int i = 0; i < n; i++) {
            res = Math.max(res, Math.max(dp[0][i], dp[1][i]));
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(maxTurbulenceSize(new int[]{5,4}));
    }
}
