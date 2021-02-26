package 动态规划.medium;

import java.util.Arrays;

/**
 * @Author Natasha
 * @Description
 * @Date 2021/2/24 8:18
 **/
public class 可获得的最大点数 {
    public static int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int min = 0;
        int step = n - k;
        for (int i = 0; i < step; i++) {
            min += cardPoints[i];
        }
        int res = min;
        for (int i = step; i < n; i++) {
            min = min + cardPoints[i] - cardPoints[i - step];
            res = Math.min(res, min);
        }
        return Arrays.stream(cardPoints).sum() - res;
    }

    public static void main(String[] args) {
        System.out.println(maxScore(new int[]{1, 2, 3, 4, 5, 6, 1}, 3));
    }
}
