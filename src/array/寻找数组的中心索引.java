package array;

/**
 * @Author Natasha
 * @Description * 比 / 好
 * @Date 2020/11/12 16:57
 **/
public class 寻找数组的中心索引 {
    public static int pivotIndex(int[] nums) {
        int res = 0;
        for(int i = 0 ; i < nums.length; i++){
            res += nums[i];
        }
        int left = 0;
        for(int i = 0 ; i < nums.length; i++){
            if(res - nums[i] == left * 2){
                return i;
            }
            left += nums[i];
        }
        return -1;
    }
    public static int pivotIndex1(int[] nums) {
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
