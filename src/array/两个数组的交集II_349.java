package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @Author Natasha
 * @Description
 * @Date 2020/11/2 16:49
 **/
public class 两个数组的交集II_349 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        int[] arr = new int[Math.max(nums1.length, nums2.length)];
        for(int i = 0 ; i < nums1.length ; i ++ ){
            if(!set.contains(nums1[i])){
                set.add(nums1[i]);
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < nums2.length ; i ++ ){
            if(set.contains(nums2[i])){
                list.add(nums2[i]);
                set.remove(nums2[i]);
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
