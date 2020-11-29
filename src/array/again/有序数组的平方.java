package array.again;

public class 有序数组的平方 {
    public static int[] sortedSquares(int[] A) {
        int left = 0;
        int right = A.length - 1;
        int cnt = A.length - 1;
        int[] arr = new int[A.length];
        while(left <= right){
            if(Math.abs(A[left]) < Math.abs(A[right])){
                arr[cnt--] = A[right] * A[right--];
            }else{
                arr[cnt--] = A[left] * A[left++];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = sortedSquares(new int[]{-7,-3,2,3,11});
        for (int i = 0; i <arr.length;i++){
            System.out.printf(arr[i]+",");
        }
    }
}
