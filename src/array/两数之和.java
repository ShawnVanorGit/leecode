package array;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @Author Natasha
 * @Description
 * @Date 2020/11/12 15:39
 **/
public class 两数之和 {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> set = new HashMap<>();
        int[] arr = new int[2];
        for(int i = 0 ; i < nums.length ; i ++ ){
            if(set.containsKey(target - nums[i])){
                arr[0] = set.get(target - nums[i]);
                arr[1] = i;
                break;
            }
            set.put(nums[i], i);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = twoSum(new int[]{3,2,4}, 6);
        for(int i = 0 ; i < arr.length ; i ++ ){
            System.out.print(arr[i] + " ");
        }
    }
}
