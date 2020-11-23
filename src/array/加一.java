package array;

import java.util.Arrays;
import java.util.List;

/**
 * @Author Natasha
 * @Description System.arraycopy:从被拷贝对象的第几个开始拷贝，拷贝到目标数组的 []
 * @Date 2020/11/12 14:27
 **/
public class 加一 {
    public static int[] plusOne(int[] digits) {
        for(int i = digits.length - 1 ; i >= 0 ; i--){
            digits[i] ++;
            if(digits[i] != 10){
                return digits;
            }
            digits[i] = 0;
        }
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        System.arraycopy(digits, 0, res, 1, digits.length);
        return res;
    }

    public static void main(String[] args) {
        int[] arr = plusOne(new int[]{9, 9});
        for(int i = 0 ; i < arr.length ; i ++ ){
            System.out.print(arr[i] + " ");
        }
    }

}
