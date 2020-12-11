package array;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Natasha
 * @Description
 * @Date 2020/12/9 9:42
 **/
public class 拥有最多糖果的孩子 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            max = Math.max(max, candies[i]);
        }
        List<Boolean> list = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            list.add(candies[i] + extraCandies >= max);
        }
        return list;
    }

    public static void main(String[] args) {
        kidsWithCandies(new int[]{4,2,1,1,2}, 1).forEach(e -> System.out.println(e));
    }
}
