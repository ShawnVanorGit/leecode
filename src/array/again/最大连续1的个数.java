package array.again;

/**
 * @Author Natasha
 * @Description
 * @Date 2020/11/18 10:07
 **/
public class 最大连续1的个数 {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int left = 0;
        int right = 0;
        int max = 0;
        int len = nums.length;
        while(right < len){
            if(nums[right++] == 0){
                max = Math.max(max, right - left - 1);
                left=right;
            }

        }
        return Math.max(max, right - left);
    }
    class Solution {
        public int findMaxConsecutiveOnes1(int[] nums) {
            int left = 0;
            int right = 0;
            int max = 0;
            while(left < nums.length && right < nums.length){
                if(nums[right] == 1){
                    right++;
                }else{
                    right++;
                    left=right;
                }
                max = Math.max(max, right - left);
            }
            return max;
        }
    }
    public static int findMaxConsecutiveOnes2(int[] nums) {
        int cnt;
        int max;
        if(nums[0] == 1){
            cnt = 1;
            max = 1;
        } else {
            cnt = 0;
            max = 0;
        }

        for(int i = 1; i < nums.length; i++){
            if(nums[i - 1] == nums[i] && nums[i] == 1){
                cnt++;
            }else{
                if(nums[i] == 0){
                    cnt = 0;
                }else{
                    cnt = 1;
                }
            }
            max = Math.max(max, cnt);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1}));
    }
}
