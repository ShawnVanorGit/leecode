package 动态规划;

/**
 * @Author Natasha
 * @Description
 * @Date 2021/1/18 9:30
 **/
public class 爬楼梯 {
    public int climbStairs(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n - 1];
    }
    //递归由于重复计算，导致效率很差，我们来看一下，有很多重复的计算，相同的颜色表示计算多次
    public int climbStairs2(int n) {
        if(n == 0){
            return 1;
        }else if(n == 1){
            return 1;
        }else{
            return climbStairs2(n - 1) + climbStairs2(n - 2);
        }
    }

    public static void main(String[] args) {

    }
}
