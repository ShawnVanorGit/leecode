package array;

/**
 * @Author Natasha
 * @Description
 * @Date 2020/12/14 17:25
 **/
public class 存在连续三个奇数的数组 {
    public boolean threeConsecutiveOdds(int[] arr) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]% 2 == 1){
                cnt++;
            }else{
                cnt = 0;
            }
            if(cnt == 3){
                return true;
            }
        }
        return false;
    }
}
