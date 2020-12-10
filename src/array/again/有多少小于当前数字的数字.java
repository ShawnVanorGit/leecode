package array.again;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @Author Natasha
 * @Description 桶排序
 * @Date 2020/12/9 8:46
 **/

public class 有多少小于当前数字的数字 {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] bucket = new int[101];
        for (int i = 0; i < nums.length; i++) {
            bucket[nums[i]]++;
        }
        for (int i = 1; i < bucket.length; i++) {
            bucket[i] += bucket[i - 1];
        }
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[i] == 0 ? 0 : bucket[nums[i] - 1];
        }
        return res;
    }

    public static void main(String[] args) {
        Arrays.stream(smallerNumbersThanCurrent(new int[]{5,0,10,0,10,6})).boxed().collect(Collectors.toList()).forEach(e -> System.out.println(e));
    }
}
