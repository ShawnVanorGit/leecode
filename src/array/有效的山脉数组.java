package array;

/**
 * @Author Natasha
 * @Description 看到别人分头行事，从左到峰顶，从右到峰顶
 * @Date 2020/11/27 15:15
 **/
public class 有效的山脉数组 {
    public static boolean validMountainArray(int[] arr) {
        int i = 1;
        boolean a = false;
        boolean b = false;
        while(i < arr.length){
            if(arr[i - 1] < arr[i]){
                i++;
                a = true;
            }else{
                break;
            }
        }
        while(i < arr.length){
            if(arr[i - 1] > arr[i]){
                i++;
                b = true;
            }else{
                return false;
            }
        }
        return a&&b;
    }

    public static void main(String[] args) {
        System.out.println(validMountainArray(new int[]{2,1}));
    }
}
