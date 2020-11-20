package array;

import java.util.HashSet;

/**
 * @Author Natasha
 * @Description
 * @Date 2020/11/2 16:22
 **/
public class 存在重复元素 {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i ++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(arr));
    }
}
