package array;

/**
 * @Author Natasha
 * @Description
 * @Date 2020/12/9 10:52
 **/
public class 在排序数组中查找数字I_二分查找 {
    public int search(int[] nums, int target) {
        int res = 0;
        for (int num : nums) {
            res += num == target ? 1 : 0;
        }
        return res;
    }
}
