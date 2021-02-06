package 动态规划.medium;

/**
 * @Author Natasha
 * @Description
 * @Date 2021/2/5 17:03
 **/
public class 最长重复子数组 {
    public static int findLength(int[] A, int[] B) {
        int a = A.length;
        int b = B.length;
        int res = 0;
        int[][] dp = new int[a + 1][b + 1];
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                if(A[i - 1] == B[j - 1]){
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }else{
                    dp[i][j] = 0;
                }
                res = Math.max(res, dp[i][j]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(findLength(new int[]{0,1,1,1,1},  new int[]{1,0,1,0,1}));
    }
}
