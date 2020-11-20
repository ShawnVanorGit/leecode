package array.again;

/**
 * @Author Natasha
 * @Description
 * 运算    说明
 * 0^0=0,0^1=1	0异或任何数，其结果=任何数
 * 1^0=1,1^1=0	1异或任何数，其结果=任何数取反
 * x^x=0	任何数异或自己，等于把自己置0
 * @Date 2020/11/2 16:26
 **/
public class 只出现一次的数字 {
    public static int singleNumber(int[] nums) {
        int res = nums[0];
        for(int i = 1; i < nums.length; i ++){
            res ^= nums[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{2,1,2};
        System.out.println(singleNumber(arr));
    }
}
