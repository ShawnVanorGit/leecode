package array;

/**
 * @Author Natasha
 * @Description
 * @Date 2020/12/14 17:19
 **/
public class 数组异或操作 {
    public static int xorOperation(int n, int start) {
        int[] arr = new int[n];
        int res = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = start + 2 * i;
            res ^= arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(xorOperation(10, 5));
    }
}
