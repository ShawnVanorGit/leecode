package array;
/**
 * @Author Natasha
 * @Description
 * @Date 2020/10/14 11:27
 **/
public class 删除排序数组中的重复项 {
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int tmp = nums[0];
        int cnt = 1;
        for (int i = 1; i < nums.length; i++){
            if(tmp != nums[i]){
                nums[cnt++] = nums[i];
                tmp = nums[i];
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int n = removeDuplicates(arr);
        for (int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }
}
