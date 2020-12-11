package array.again;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

/**
 * @Author Natasha
 * @Description
 * @Date 2020/12/10 10:25
 **/
public class 数组的度 {
    public static int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> left = new HashMap<>();
        HashMap<Integer, Integer> right = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])){
                left.put(nums[i], i);
            }
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            right.put(nums[i], i);
        }
        int key = Collections.max(map.values());
        int max = Integer.MAX_VALUE;
        for (int m : map.keySet()) {
            if(map.get(m) == key){
                max = Math.min(right.get(m) - left.get(m) + 1, max);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(findShortestSubArray(new int[]{}));
    }
}
