package array.again;

/**
 * @Author Natasha
 * @Description 异或
 * @Date 2020/12/10 9:27
 **/
public class 消失的数字 {
    public static int missingNumber(int[] nums) {
        int res = nums.length;
        for (int i = 0; i < nums.length; i++) {
            res ^= nums[i] ^ i;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
    }
}
