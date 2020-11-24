package array.again;

/**
 * @Author Natasha
 * @Description
 * @Date 2020/11/24 11:32
 **/
public class 按奇偶排序数组 {
    public static int[] sortArrayByParity(int[] A) {
        int i = 0;
        int j = A.length - 1;
        while(i <= j){
            while(i < A.length && A[i] % 2 == 0){
                i++;
            }
            while(j >= 0 && A[j] % 2 == 1){
                j--;
            }
            if(i < j){
                int tmp = A[i];
                A[i++] = A[j];
                A[j--] = tmp;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int[] arr = sortArrayByParity(new int[]{0,2});
        for(int i = 0; i < arr.length; i++){
            System.out.printf(arr[i]+" ");
        }
    }
}
