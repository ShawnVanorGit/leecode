package array;

/**
 * @Author Natasha
 * @Description
 * @Date 2020/10/31 10:29
 **/
public class 旋转数组的最小数字 {
    public static int minArray(int[] numbers) {
        int tmp = numbers[0];
        for(int i = 1 ; i < numbers.length ;i++) {
            if(numbers[i] < numbers[i - 1]){
                tmp = numbers[i];
                break;
            }
        }
        return tmp;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5};
        System.out.println(minArray(arr));
    }
}
