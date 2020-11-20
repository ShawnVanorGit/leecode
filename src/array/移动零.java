package array;

/**
 * @Author Natasha
 * @Description
 * @Date 2020/11/12 15:21
 **/
public class 移动零 {
    public void moveZeroes(int[] nums) {
        int cnt = 0;
        for(int i = 0 ; i < nums.length ; i ++ ){
            if(nums[i] != 0){
                nums[cnt++] = nums[i];
            }
        }
        for(int i = cnt ; i < nums.length ; i ++ ){
            nums[cnt++] = 0;
        }
    }
}
