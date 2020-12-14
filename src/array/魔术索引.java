package array;

/**
 * @Author Natasha
 * @Description
 * @Date 2020/12/14 17:02
 **/
public class 魔术索引 {
    public static int findMagicIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == i){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findMagicIndex(new int[]{1, 1, 1}));
    }
}
