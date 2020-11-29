package array;

/**
 * @Author Natasha
 * @Description 官方题解分两次判断A[index]的值
 * @Date 2020/11/27 15:15
 **/

public class 查询后的偶数和 {
    public static int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] arr = new int[A.length];
        int sum = 0;
        for (int j = 0; j < A.length; j++) {
            if (A[j] % 2 == 0) {
                sum += A[j];
            }
        }
        for(int i = 0; i < A.length; i++) {
            int val = queries[i][0];
            int idx = queries[i][1];
            if(A[idx] % 2 == 0){
                sum -= A[idx];
            }
            A[idx] += val;
            if(A[idx] % 2 == 0){
                sum += A[idx];
            }
            arr[i] = sum;
        }
        return arr;
    }
    public static int[] sumEvenAfterQueries1(int[] A, int[][] queries) {
        int[] arr = new int[A.length];
        int sum = 0;
        for (int j = 0; j < A.length; j++) {
            if(A[j] % 2 == 0){
                sum += A[j];
            }
        }
        for(int i = 0; i < A.length; i++){
            int val = queries[i][0];
            int idx = queries[i][1];

            if((A[idx] + val) % 2 == 0){
                sum += val;
                if(A[idx] % 2 != 0){
                    sum += A[idx];
                }
            }else{
                if(A[idx] % 2 == 0){
                    sum -= A[idx];
                }
            }
            arr[i] = sum;
            A[idx] += val;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = sumEvenAfterQueries(new int[]{1,2,3,4}, new int[][]{{1,0},{-3,1},{-4,0},{2,3}});
        for (int i = 0; i <arr.length;i++){
            System.out.printf(arr[i]+",");
        }
    }
}
