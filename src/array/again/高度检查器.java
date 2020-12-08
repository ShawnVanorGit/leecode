package array.again;

import java.util.Arrays;
/*
只关心是否在正确的位置上，不关心排序
 */
public class 高度检查器 {
    public static int heightChecker(int[] heights) {
        int[] arr = new int[101];
        for (int i = 0; i < heights.length; i++) {
            arr[heights[i]]++;
        }
        int cnt = 0;
        for (int i = 0, j = 0; i < arr.length; i++) {
            while(arr[i]-- > 0){
                if(i != heights[j++]){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static int heightChecker1(int[] heights) {
        int[] arr = Arrays.copyOf(heights, heights.length);
        Arrays.sort(heights);
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != heights[i]){
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(heightChecker(new int[]{1,1,4,2,1,3}));
    }
}
