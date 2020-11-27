package array;

/**
 * @Author Natasha
 * @Description
 * @Date 2020/11/27 15:15
 **/
public class 有效的山脉数组 {
    public static boolean validMountainArray(int[] arr) {
        int up = 0;
        int down = 0;
        boolean upBol = true;
        for(int i = 1; i < arr.length; i++){
            if(arr[i - 1] <= arr[i]){
                up++;
                if(down > 0){
                    upBol = false;
                    return false;
                }
            }else{
                down++;
            }
        }
        return up > 0 && upBol && down > 0;
    }

    public static void main(String[] args) {
        System.out.println(validMountainArray(new int[]{1,1,1,1,1,1,1,2,1}));
    }
}
