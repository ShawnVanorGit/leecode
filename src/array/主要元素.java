package array;

/**
 * @Author Natasha
 * @Description 摩尔投票法
 * @Date 2020/12/9 10:54
 **/
public class 主要元素 {
    public static int majorityElement(int[] nums) {
        int num = 1;
        int mark = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(mark != nums[i]){
                num--;
            }else{
                num++;
            }
            if(num == 0){
                mark = nums[i];
                num = 1;
            }
        }
        int n = 0;
        for (int i : nums) {
            if(mark == i){
                n++;
            }
        }
        return n > nums.length / 2 ? mark : -1;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{1,2,5,9,5,9,5,5,5}));
    }
}
