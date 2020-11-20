package array.again;

/**
 * @Author Natasha
 * @Description 线性时间复杂度，常量级的空间复杂度，异或again或者数学才有可能
 * @Date 2020/11/17 8:43
 **/

public class 丢失的数字 {
    public static int missingNumber1(int[] nums) {
        boolean[] arr = new boolean[nums.length + 1];
        for(int i = 0 ;i < nums.length; i++){
            arr[nums[i]] = true;
        }
        for(int i = 0 ;i < arr.length; i++){
            if(!arr[i]){
                return i;
            }
        }
        return -1;
    }

    public static int missingNumber2(int[] nums) {
        int num = 0;
        for(int i = 0 ;i < nums.length + 1; i++){
            num += i;
        }
        for(int i = 0 ;i < nums.length; i++){
            num -= nums[i];
        }
        return num;
    }

    public static int missingNumber3(int[] nums) {
        int num = nums.length;
        for(int i = 0 ;i < nums.length; i++){
            num ^= nums[i] ^ i;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(missingNumber3(new int[]{9,6,4,2,3,5,7,0,1}));
    }
}
