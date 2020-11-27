package array;

/**
 * @Author Natasha
 * @Description 动态规划：数组存放所有值。避免暴力递归造成大量重复计算
 * @Date 2020/11/27 15:15
 **/
public class 斐波那契数_动态规划 {
    public static int fib(int N) {
        int dp[] = new int[N + 1];
        if(N <= 1){
            return N;
        }
        dp[0] = 0;
        dp[1] = 1;
        int i = 2;
        while (i <= N){
            dp[i] = dp[i - 2] + dp[i - 1];
            i++;
        }
        return dp[N];
    }
    public int fib1(int N) {
        if(N == 0){
            return 0;
        }else if(N == 1){
            return 1;
        }else{
            return fib(N - 1) + fib(N - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(fib(3));
    }
}
