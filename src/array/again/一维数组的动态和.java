package array.again;

import java.util.Arrays;

/**
 * @Author Natasha
 * @Description 让数组后一个元素加上前一个元素
 * @Date 2020/12/10 9:16
 **/
public class 一维数组的动态和 {
    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }

    public static int[] runningSum1(int[] nums) {
        int[] res = new int[nums.length];
        int tmp = 0;
        for (int i = 0; i < nums.length; i++) {
            tmp += nums[i];
            res[i] = tmp;
        }
        return res;
    }

    public static void main(String[] args) {
        Arrays.stream(runningSum(new int[]{1,2,3,4})).boxed().forEach(e -> System.out.println(e));
    }
}
