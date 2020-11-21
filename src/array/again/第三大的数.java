package array.again;

public class 第三大的数 {
    public static int thirdMax(int[] nums) {
        long one = Long.MIN_VALUE;
        long two = Long.MIN_VALUE;
        long three = Long.MIN_VALUE;
        for(int i = 0 ; i < nums.length; i ++){
            if(one == nums[i] || two == nums[i] || three == nums[i]){
                continue;
            }
            if(nums[i] > one){
                three = two;
                two = one;
                one = nums[i];
            }else if(nums[i] > two){
                three = two;
                two = nums[i];
            }else if(nums[i] > three){
                three = nums[i];
            }
        }
        return  three == Long.MIN_VALUE ? (int)one : (int)three;
    }

    public static int thirdMax2(int[] nums) {
        int one = Integer.MIN_VALUE;
        int two = Integer.MIN_VALUE;
        int three = Integer.MIN_VALUE;
        int flag = 0;
        boolean b = true;
        for(int i = 0 ; i < nums.length; i ++){
            if(nums[i] == Integer.MIN_VALUE && b){
                flag++;
                b = false;
            }
            if(nums[i] > one){
                flag++;
                three = two;
                two = one;
                one = nums[i];
            }else if(nums[i] > two && nums[i] < one){
                flag++;
                three = two;
                two = nums[i];
            }else if(nums[i] > three && nums[i] < two){
                flag++;
                three = nums[i];
            }
        }
        return  flag < 3 ? one : three;
    }

    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{-2147483648,-2147483648,-2147483648,-2147483648,1,1,1}));
    }
}
