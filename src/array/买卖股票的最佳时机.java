package array;

/**
 * @Author Natasha
 * @Description
 * @Date 2020/11/13 15:57
 **/
public class 买卖股票的最佳时机 {
    public static int maxProfit(int[] prices) {
        if(prices.length == 0){
            return 0;
        }
        int min = prices[0];
        int max = 0;
        for (int i = 1 ; i < prices.length; i++){
            if(prices[i] > min){
                max = Math.max(max, prices[i] - min);
            }
            min = Math.min(min, prices[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,6,4,3,1}));
    }
}
