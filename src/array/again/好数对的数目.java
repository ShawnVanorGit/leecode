package array.again;

/**
 * @Author Natasha
 * @Description
 * @Date 2020/12/10 8:44
 **/
public class 好数对的数目 {
    public static int numIdenticalPairs(int[] nums) {
        int[] res = new int[101];
        int cnt = 0;
        for (int num : nums) {
            cnt += res[num]++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(numIdenticalPairs(new int[]{1,1,1,1}));
    }
}
