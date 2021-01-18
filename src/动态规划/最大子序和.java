package 动态规划;

/**
 * @Author Natasha
 * @Description
 * @Date 2021/1/18 8:31
 **/
public class 最大子序和 {
    public static int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(dp[i - 1] < 0){
                dp[i] = nums[i];
            } else{
                dp[i] = dp[i - 1] + nums[i];
            }
            res = Math.max(res, dp[i]);
        }
        return res;
    }
    //只需要一个变量tmp保存前面子组合的最大值
    public int maxSubArray2(int[] nums) {
        int tmp = nums[0];
        int res = tmp;
        for (int i = 1; i < nums.length; i++) {
            if(tmp < 0){
                tmp = 0;
            }
            tmp += nums[i];
            res = Math.max(res, tmp);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
