package array.again;

/**
 * @Author Natasha
 * @Description
 * @Date 2020/12/3 8:47
 **/
public class 复写零 {
    public static void duplicateZeros(int[] arr) {
        int i = 0;
        int j = 0;
        while (j < arr.length) {
            if(arr[i] == 0){
                j++;
            }
            i++;
            j++;
        }
        i--;
        j--;
        while(i >= 0){
            if(arr[i] == 0){
                arr[j--] = arr[i];
            }
            arr[j--] = arr[i--];
        }
        return;
    }

    public static void main(String[] args) {
        duplicateZeros(new int[]{0,0,0,0,0,0,0});
    }
}
