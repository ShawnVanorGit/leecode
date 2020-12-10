package array;

/**
 * @Author Natasha
 * @Description
 * @Date 2020/12/9 10:26
 **/
public class 判定字符是否唯一 {
    public boolean isUnique(String astr) {
        int[] arr = new int[101];
        for (int i = 0; i < astr.length(); i++) {
            char c = astr.charAt(i);
            arr[c - 97]++;
            if(arr[c - 97] > 1){
                return false;
            }
        }
        return true;
    }
}
