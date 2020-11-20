package array;

/**
 * @Author Natasha
 * @Description
 * @Date 2020/10/27 19:51
 **/
public class 最大子序和_贪心 {
    public static int maxSubArray(int[] nums) {
        int maxTmp = Integer.MIN_VALUE;
        int tmp = 0;
        for(int i = 0; i < nums.length; i ++){
            tmp += nums[i];
            maxTmp = Math.max(tmp, maxTmp);
            if(tmp < 0){
                tmp = 0;
            }
        }
        return maxTmp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
}
