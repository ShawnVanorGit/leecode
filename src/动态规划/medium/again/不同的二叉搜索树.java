package 动态规划.medium.again;

/**
 * @Author Natasha
 * @Description 注意当n = 3时，f(2)的意思是以2为根结点可能出现的树，节点数有1,3
 * 当 i 为根节点时，其左子树节点个数为 i-1 个，右子树节点为 n-i
 * G(1) = 1
 * G(2) = G(0) * G(1) + G(1) * G(0)
 * G(3) = G(0) * G(2) + G(1) * G(1) + G(2) * G(0)
 * @Date 2021/1/26 12:26
 **/
public class 不同的二叉搜索树 {
    public static int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(numTrees(3));
    }
}
