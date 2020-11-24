package array;

/**
 * @Author Natasha
 * @Description
 * @Date 2020/11/24 9:17
 **/
public class 单调数列 {
    public static boolean isMonotonic(int[] A) {
        boolean a = true;
        boolean b = true;
        for (int i = 1; i < A.length; i++){
            if(A[i - 1] < A[i]){
                if(!a){
                    return false;
                }
                b = false;
            }else if(A[i - 1] > A[i]){
                if(!b){
                    return false;
                }
                a = false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isMonotonic(new int[]{6,5,4,4}));
    }
}
