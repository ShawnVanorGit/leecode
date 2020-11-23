package array;

public class 至少是其他数字两倍的最大数 {
    public static int dominantIndex(int[] nums) {
        int one = Integer.MIN_VALUE;
        int two = Integer.MIN_VALUE;
        int idx = 0;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] > one){
                two = one;
                one = nums[i];
                idx = i;
            }else if(nums[i] > two){
                two = nums[i];
            }
        }
        if(one >= two * 2){
            return idx;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(dominantIndex(new int[]{3, 6, 1, 0}));
    }
}
