package array;

/**
 * @Author Natasha
 * @Description 计数器法
 * @Date 2020/12/11 8:32
 **/
public class 找出数组中的幸运数 {

    public static int findLucky(int[] arr) {
        int[] res = new int[501];
        for (int i = 0; i < arr.length; i++) {
            res[arr[i]]++;
        }
        for (int i = res.length - 1; i > 0; i--) {
            if(i == res[i]){
                return i;
            }
        }
        return -1;
    }

    public int findLucky1(int[] arr) {
        int[] res = new int[501];
        for (int i = 0; i < arr.length; i++) {
            res[arr[i]]++;
        }
        int tmp = Integer.MIN_VALUE;
        for (int i = 0; i < res.length; i++) {
            if(res[i] > 0 && i == res[i]){
                tmp = Math.max(tmp, i);
            }
        }
        return tmp == Integer.MIN_VALUE ? -1 : tmp;
    }

    public static void main(String[] args) {
        System.out.println(findLucky(new int[]{2,2,2,3,3}));
    }
}
