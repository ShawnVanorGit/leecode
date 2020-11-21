package array.again;

import java.util.Arrays;

public class 数组拆分I {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int num = 0;
        for(int i = 1 ; i < nums.length; i+=2){
            num += nums[i - 1];
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(arrayPairSum(new int[]{1,4,3,2}));
    }
}
