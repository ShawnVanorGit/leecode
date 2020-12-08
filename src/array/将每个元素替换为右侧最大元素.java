package array;

public class 将每个元素替换为右侧最大元素 {
    public static int[] replaceElements(int[] arr) {
        int n = arr.length;
        int currentNum;
        int max = arr[n - 1];
        arr[n - 1] = -1;
        for(int i = n - 2; i >= 0; i--){
            currentNum = arr[i];
            arr[i] = max;
            if(currentNum > max){
                max = currentNum;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = replaceElements(new int[]{17,18,5,4,6,1});
        for (int i = 0; i < arr.length;i++){
            System.out.printf(arr[i]+",");
        }
    }
}
