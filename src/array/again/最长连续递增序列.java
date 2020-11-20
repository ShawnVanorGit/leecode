package array.again;

/**
 * @Author Natasha
 * @Description
 * @Date 2020/11/20 14:18
 **/
public class 最长连续递增序列 {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int cnt = 1;
        int max = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i - 1] < nums[i]){
                cnt++;
            }else{
                cnt = 1;
            }
//            max = Math.max(cnt, max);
            max = cnt > max ? cnt : max;
        }
        return max;
    }
}
