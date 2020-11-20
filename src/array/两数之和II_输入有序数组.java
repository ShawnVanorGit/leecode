package array;

/**
 * @Author Natasha
 * @Description
 * @Date 2020/11/13 19:20
 **/
public class 两数之和II_输入有序数组 {
    public static int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        int[] arr = new int[2];
        while(i < j){
            if(numbers[i] + numbers[j] > target){
                j--;
            } else if(numbers[i] + numbers[j] < target){
                i++;
            }
            if(numbers[i] + numbers[j] == target){
                arr[0] = i + 1;
                arr[1] = j + 1;
                return arr;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = twoSum(new int[]{2, 7, 11, 15}, 9);
        for(int i = 0 ; i < arr.length ; i ++ ){
            System.out.print(arr[i] + " ");
        }
    }
}
