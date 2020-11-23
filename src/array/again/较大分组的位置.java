package array.again;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 较大分组的位置 {
    public static List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> ans = new ArrayList();
        int len = S.length();
        int j = 0;
        for(int i = 0; i < len; i++){
            if(i == len - 1 || S.charAt(i) != S.charAt(i + 1)){
                if(i - j + 1 >= 3){
                    ans.add(Arrays.asList(new Integer[]{j, i}));
                }
                j = i + 1;
            }
        }
        return ans;
    }
    public List<List<Integer>> largeGroupPositions2(String S) {
        List<List<Integer>> ans = new ArrayList();
        int i = 0, N = S.length(); // i is the start of each group
        for (int j = 0; j < N; ++j) {
            if (j == N-1 || S.charAt(j) != S.charAt(j+1)) {
                // Here, [i, j] represents a group.
                if (j-i+1 >= 3)
                    ans.add(Arrays.asList(new Integer[]{i, j}));
                i = j + 1;
            }
        }
        return ans;
    }

    public static List<List<Integer>> largeGroupPositions1(String S) {
        char[] arr = S.toCharArray();
        int left = 0;
        int right = 1;
        int cnt = 0;
        List<List<Integer>> list = new ArrayList<>();
        while(right < arr.length){
            if(arr[right] == arr[left]){
                cnt++;
                right++;
            }else{
                if(cnt >= 2){
                    List<Integer> l = new ArrayList<>();
                    l.add(left);
                    l.add(right - 1);
                    list.add(l);
                }
                cnt = 0;
                left = right++;
            }
        }
        if(cnt >= 2){
            List<Integer> l = new ArrayList<>();
            l.add(left);
            l.add(right - 1);
            list.add(l);
        }
        return list;
    }

    public static void main(String[] args) {
        List<List<Integer>> list = largeGroupPositions("abbxxxxzyy");
        for(int i = 0 ;i < list.size();i++){
            System.out.println("["+list.get(i).get(0)+","+list.get(i).get(1)+"]");
        }
    }
}
