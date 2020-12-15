package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author Natasha
 * @Description
 * @Date 2020/12/15 8:42
 **/
public class 最小绝对差 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = 0;
        int bet = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            min = arr[i] - arr[i - 1];
            bet = Math.min(min, bet);
        }
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] - arr[i - 1] == bet){
                List l = new ArrayList();
                l.add(arr[i - 1]);
                l.add(arr[i]);
                lists.add(l);
            }
        }
        return lists;
    }
}
