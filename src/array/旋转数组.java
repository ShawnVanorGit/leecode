package array;

/**
 * @Author Natasha
 * @Description
 * @Date 2020/10/31 10:30
 **/
public class 旋转数组 {
    public static int[] rotate(int[] nums, int k) {
        k %= nums.length;
        if(nums.length == 1){
            return nums;
        }
        reverse(nums, 0 , nums.length - 1 );
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        return nums;
    }
    public static int[] reverse(int[] arr, int s, int e){
        while(s < e){
            int tmp = arr[s];
            arr[s++] = arr[e];
            arr[e--] = tmp;
        }
        return arr;
    }
    public void main(String[] args) {
        int[] test = {1,2,3,4,5,6,7};
        int[] arr = rotate(test, 3);
        for(int i = 0; i < arr.length; i ++){
            System.out.print(arr[i] + " ");
        }
    }
}
