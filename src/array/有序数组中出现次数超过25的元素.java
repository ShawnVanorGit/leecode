package array;

import java.util.HashMap;

public class 有序数组中出现次数超过25的元素 {
    public static int findSpecialInteger(int[] arr) {
        int n = arr.length / 4;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == arr[ i + n]){
                return arr[i];
            }
        }
        return -1;
    }
    public static int findSpecialInteger1(int[] arr) {
        int n = (int) (arr.length * 0.25);
        HashMap<Integer, Integer> map =new HashMap<>();
        for (int a : arr) {
            map.put(a, map.getOrDefault(a, 0) + 1);
            if(map.containsKey(a) && map.get(a) > n){
                return a;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findSpecialInteger(new int[]{1,2,2,6,6,6,6,7,10}));
    }
}
