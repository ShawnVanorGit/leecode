package 动态规划.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author Natasha
 * @Description 自底向上，
 * @Date 2021/1/25 13:44
 **/
public class 三角形最小路径和 {
    public static int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n + 1][n + 1];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                 dp[i][j] = Math.min(dp[i + 1][j], dp[i + 1][j + 1]) + triangle.get(i).get(j);
            }
        }
        return dp[0][0];
    }

    public static void main(String[] args) {
        List<Integer> a = Arrays.stream(new int[]{2}).boxed().collect(Collectors.toList());
        List<Integer> b = Arrays.stream(new int[]{3, 4}).boxed().collect(Collectors.toList());
        List<Integer> c = Arrays.stream(new int[]{6, 5, 7}).boxed().collect(Collectors.toList());
        List<Integer> d = Arrays.stream(new int[]{4, 1, 8, 3}).boxed().collect(Collectors.toList());
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(a);
        triangle.add(b);
        triangle.add(c);
        triangle.add(d);
        System.out.println(minimumTotal(triangle));
    }
}
