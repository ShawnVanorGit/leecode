package array;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @Author Natasha
 * @Description
 * @Date 2020/12/9 11:25
 **/
public class 重新排列数组 {
    public static int[] shuffle(int[] nums, int n) {
        int[] res = new int[2 * n];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            res[cnt++] = nums[i];
            res[cnt++] = nums[i + n];
        }
        return res;
    }

    public static void main(String[] args) {
        Arrays.stream(shuffle(new int[]{1,2,3,4,4,3,2,1}, 4)).boxed().forEach(e -> System.out.println(e));
    }
}
