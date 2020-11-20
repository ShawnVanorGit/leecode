package array.again;

/**
 * @Author Natasha
 * @Description 用两while就可以。。。 官方解法3 是根据是上升线段就+，更简单
 * @Date 2020/10/14 17:45
 **/
public class 买卖股票的最佳时机II_贪心 {
    public static int maxProfit2(int[] prices) {
        if(prices.length == 0){
            return 0;
        }
        int i = 1;
        int res = 0;
        int low = 0;
        int high = 0;
        while(i < prices.length){
            while(i < prices.length && prices[i - 1] >= prices[i]){
                i++;
            }
            low = prices[i - 1];
            while(i < prices.length && prices[i - 1] <= prices[i]){
                i++;
            }
            high = prices[i - 1];
            res += high - low;
        }
        return res;
    }

    public static int maxProfit3(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int res = 0;
        for(int i = 1 ;i < prices.length; i++){
            if(prices[i] >= prices[i-1]){
                res += prices[i] - prices[i - 1];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit3(arr));
    }
}
