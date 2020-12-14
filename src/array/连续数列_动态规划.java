package array;

/**
 * @Author Natasha
 * @Description
 * @Date 2020/12/14 17:04
 **/
public class 连续数列_动态规划 {
    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            max = Math.max(max, sum);
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
