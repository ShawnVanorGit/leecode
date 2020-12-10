package array;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @Author Natasha
 * @Description
 * @Date 2020/12/9 9:47
 **/
public class 统计位数为偶数的数字 {
    public static int findNumbers(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res += String.valueOf(num).length() % 2 == 0 ? 1 : 0;
        }
        return res;
    }
    public static int findNumbers1(int[] nums) {
        String[] str1 = Arrays.stream(nums).boxed().map(i -> i.toString()).collect(Collectors.joining(",")).split(",");
        int res = 0;
        for (int i = 0; i < str1.length; i++) {
            res += str1[i].length() % 2 == 0 ? 1 : 0;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(findNumbers(new int[]{555,901,482,1771}));
    }
}
