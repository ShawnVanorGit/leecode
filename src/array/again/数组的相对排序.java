package array.again;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/*
* 计数排序
* */
public class 数组的相对排序 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int upper = 0;
        for (int x : arr1) {
            upper = Math.max(upper, x);
        }
        int[] arr = new int[upper + 1];
        for (int a1 : arr1) {
            arr[a1]++;
        }
        int[] res = new int[arr1.length];
        int cnt = 0;
        for (int a2 : arr2) {
            while(arr[a2] > 0){
                res[cnt++] = a2;
                arr[a2]--;
            }
        }
        for (int i = 0; i < 1001; i++) {
            while(arr[i] > 0){
                res[cnt++] = i;
                arr[i]--;
            }
        }
        return res;
    }
    public int[] relativeSortArray1(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int a1 : arr1) {
            map.put(a1, map.getOrDefault(a1, 0) + 1);
        }
        int[] arr = new int[arr1.length];
        int cnt = 0;
        for (int a2 : arr2) {
            while(map.containsKey(a2) && map.get(a2) > 0){
                arr[cnt++] = a2;
                map.put(a2, map.get(a2) - 1);
            }
        }
        Arrays.sort(arr1);
        for (int a1 : arr1) {
            while(map.containsKey(a1) && map.get(a1) > 0){
                arr[cnt++] = a1;
                map.put(a1, map.get(a1) - 1);
            }
        }
        return arr;
    }
}
