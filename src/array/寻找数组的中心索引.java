package array;

/**
 * @Author Natasha
 * @Description
 * @Date 2020/11/12 16:57
 **/
public class 寻找数组的中心索引 {
    public static int pivotIndex(int[] nums) {
        int sum = qiuhe(nums, 0, nums.length);
        for(int i = 0 ; i < nums.length ; i ++ ){
            if((sum - nums[i]) % 2 == 0){
                if(qiuhe(nums, 0, i) == qiuhe(nums, i + 1, nums.length)){
                    return i;
                }
            }
        }
        return -1;
    }
    public static int qiuhe(int[] arr, int i, int j){
        int sum = 0;
        for(int k = i ; k < j ; k ++ ){
            sum += arr[k];
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
    }
}
