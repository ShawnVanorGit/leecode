package array;

/**
 * @Author Natasha
 * @Description 一个萝卜一个坑
 * @Date 2020/12/9 10:12
 **/
public class 数组中重复的数字 {
    public int findRepeatNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i){
                if(nums[nums[i]] == nums[i]){
                    return nums[i];
                }else{
                    nums[nums[i]] = nums[i];
                }
            }
        }
        return -1;
    }
    public int findRepeatNumber1(int[] nums) {
        int[] bucket = new int[100001];
        for (int num : nums) {
            bucket[num]++;
            if(bucket[num] > 1){
                return num;
            }
        }
        return -1;
    }
}
