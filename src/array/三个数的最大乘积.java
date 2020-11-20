package array;

import java.util.Arrays;

/**
 * @Author Natasha
 * @Description 不用排序，用线性扫描
 * tip： for循环是随机访问元素，foreach是顺序链表访问元素，foreach比for快
 * @Date 2020/11/19 10:06
 **/
public class 三个数的最大乘积 {
    public static int maximumProduct(int[] nums) {
        int minnum1 = Integer.MAX_VALUE;
        int minnum2 = Integer.MAX_VALUE;
        int maxnum1 = Integer.MIN_VALUE;
        int maxnum2 = Integer.MIN_VALUE;
        int maxnum3 = Integer.MIN_VALUE;
        for (int n: nums) {
            if(n < minnum1){
                minnum2 = minnum1;
                minnum1 = n;
            }else if(n < minnum2){
                minnum2 = n;
            }
            if(n > maxnum1){
                maxnum3 = maxnum2;
                maxnum2 = maxnum1;
                maxnum1 = n;
            }else if(n > maxnum2){
                maxnum3 = maxnum2;
                maxnum2 = n;
            } else if(n > maxnum3){
                maxnum3 = n;
            }
        }
        return Math.max(minnum1 * minnum2 * maxnum1, maxnum1 * maxnum2 * maxnum3);
    }

    public static int maximumProduct1(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        return Math.max(nums[len - 3] * nums[len - 2] * nums[len - 1], nums[0] * nums[1] * nums[len - 1]);
    }

    public static void main(String[] args) {
        System.out.println(maximumProduct(new int[]{1,2,3,4}));
    }
}
