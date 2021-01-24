package 动态规划.medium;

/**
 * @Author Natasha
 * @Description
 * @Date 2021/1/23 13:43
 **/
public class 最长递增子序列 {
    public static int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int res = 1;
        int tmp = 0;
        for (int i = 0; i < n; i++) {
            if(nums[i] > tmp){
                res += 1;
                tmp = nums[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
    }
}
