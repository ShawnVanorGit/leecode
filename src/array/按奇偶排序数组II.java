package array;

/**
 * @Author Natasha
 * @Description
 * @Date 2020/11/27 14:59
 **/
public class 按奇偶排序数组II {
    public int[] sortArrayByParityII(int[] A) {
        int[] arr = new int[A.length];
        int idx1 = 0;
        int idx2 = 1;
        for(int a : A){
            if(a % 2 == 0){
                arr[idx1] = a;
                idx1+=2;
            }else{
                arr[idx2] = a;
                idx2+=2;
            }
        }
        return arr;
    }

    public static int[] sortArrayByParityII1(int[] A) {
        int i = 0;
        int j = 1;
        int n = A.length;
        while(i < n && j < n){
            while(i < n && A[i]%2==0){
                i+=2;
            }
            while(j < n && A[j]%2==1){
                j+=2;
            }
            if(i < n && j < n){
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
                i+=2;
                j+=2;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int[] arr = sortArrayByParityII1(new int[]{2,3});
        for(int a: arr){
            System.out.printf(a+",");
        }
    }
}
