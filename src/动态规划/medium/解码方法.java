package 动态规划.medium;

/**
 * @Author Natasha
 * @Description 这道题和爬楼梯（一次可以爬一步，也可以爬两步，问有多少中方式到达终点）很像，最后一种状态是由前两种状态转换来的。所以状态转移方程是dp[i]=dp[i-1]+dp[i-2]
 * 考虑边界问题：如果字母大于26，则不存在dp[i - 2].
 *
 * 例子：[1,2,2]有三种解码：
 * 1 - 2 - 2
 * 12 - 2
 * 1 - 22
 * 加入一个新元素2之后有3+2种解码：
 * 1 - 2 - 2 - '2'
 * 12 - 2 - '2'
 * 1 - 22 - '2'
 * (新增加的结果：)
 * '1' - '2' - '22'
 * '12' - '22'
 *
 * @Date 2021/1/28 8:29
 **/
public class 解码方法 {
    public static int numDecodings(String s) {
        if(s.charAt(0) == '0'){
            return 0;
        }

        int n = s.length();
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            char c = s.charAt(i);
            if(c != '0'){
                dp[i] = dp[i - 1];
            }

            int num = 10 * (s.charAt(i - 1) - '0') + s.charAt(i) - '0';
            if(num >= 10 && num <= 26){
                if(i > 1){
                    dp[i] += dp[i - 2];
                }
                else{
                    dp[i]++;
                }
            }
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {
        String s = "0";
        System.out.println(numDecodings(s));
    }
}
