package array.again;

import java.util.Arrays;

/**
 * @Author Natasha
 * @Description 这个对数表达式值得回顾 res += arr[d[0] * 10 + d[1]]++;
 * @Date 2021/1/26 15:20
 **/
public class 等价多米诺骨牌对的数量 {
    public static int numEquivDominoPairs(int[][] dominoes) {
        int[] arr = new int[100];
        int res = 0;
        for (int[] d : dominoes) {
            Arrays.sort(d);
            res += arr[d[0] * 10 + d[1]]++;
        }
        return res;
    }
    public static int numEquivDominoPairs1(int[][] dominoes) {
        int n = dominoes.length;
        int[] nums = new int[n];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            Arrays.sort(dominoes[i]);
            nums[i] = Integer.parseInt(dominoes[i][0]+""+dominoes[i][1]);
        }
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if(nums[i] == nums[j]){
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(numEquivDominoPairs(new int[][]{{1,2},{2,1},{2,1},{2,1},{5,6}}));
    }
}
