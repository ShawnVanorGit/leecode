package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * @Author Natasha
 * @Description
 * @Date 2020/11/12 14:03
 **/
public class 两个数组的交集II_350 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[Math.max(nums1.length, nums2.length)];
        for(int i = 0 ; i < nums1.length ; i ++ ){
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < nums2.length ; i ++ ){
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0){
                list.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1);
            }
        }
        return list.stream().mapToInt(Integer::valueOf).toArray();
    }

    public static void main(String[] args) {
        int[] arr = intersect(new int[]{1,2,2,1}, new int[]{2,2});
        for(int i = 0 ; i < arr.length ; i ++ ){
            System.out.println(arr[i]);
        }
    }
}
