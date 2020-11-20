package array.again;

/**
 * @Author Natasha
 * @Description 这道题的重点是递增折线
 * @Date 2020/10/27 17:48
 **/
public class 非递减数列_贪心 {
    public static boolean checkPossibility(int[] nums) {
        int cnt = 0;
        for(int i = 0 ;i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                cnt++;
                if (cnt > 1) {
                    return false;
                }
                if(i > 0){
                    if(nums[i - 1] <= nums[i + 1]){
                        nums[i] = nums[i + 1];
                    } else {
                        nums[i + 1] = nums[i];
                    }
                }
            }
        }
        return true;
    }
    public static boolean checkPossibility1(int[] nums) {
        int cnt = 0;
        for(int i = 0 ;i < nums.length - 1; i++){
            if(nums[i] > nums[i + 1]){
                cnt++;
                if(cnt > 1){
                    return false;
                }
                if( i > 0 && nums[i - 1] > nums[i + 1]){
                    nums[i + 1] = nums[i];
                }else {
                    nums[i] = nums[i + 1];
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{4,2,3};
        System.out.println(checkPossibility(arr));
    }
}
