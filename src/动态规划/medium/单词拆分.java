package 动态规划.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @Author Natasha
 * @Description 注意substring不包尾巴，所以<=n
 * @Date 2021/1/28 15:20
 **/
public class 单词拆分 {
    public static boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<>(wordDict);
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if(dp[j] && set.contains(s.substring(j, i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
     }

    public static void main(String[] args) {
        String[] str = new String[]{"app", "le"};
        System.out.println(wordBreak("apple",Arrays.asList(str)));
    }
}
