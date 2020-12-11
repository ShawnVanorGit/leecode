package array;

/**
 * @Author Natasha
 * @Description
 * @Date 2020/12/9 10:32
 **/
public class 缺失的数字 {
    public static int missingNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i){
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{0}));
    }
}
