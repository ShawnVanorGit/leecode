package array;

/**
 * @Author Natasha
 * @Description
 * @Date 2020/12/14 17:22
 **/
public class 数组中两元素的最大乘积 {
    public static int maxProduct(int[] nums) {
        int one = 0;
        int two = 0;
        for (int num : nums) {
            if(num > one){
                two = one;
                one = num;
            } else if(num > two){
                two = num;
            }
        }
        return (two - 1) * (one - 1);
    }

    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{1,5,4,5}));
    }
}
