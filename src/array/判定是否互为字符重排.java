package array;

/**
 * @Author Natasha
 * @Description
 * @Date 2020/12/9 11:12
 **/
public class 判定是否互为字符重排 {
    public boolean CheckPermutation(String s1, String s2) {
        int l1 = s1.length();
        if(l1 != s2.length()){
            return false;
        }
        int[] c1 = new int[26];
        for (int i = 0; i < l1; i++) {
            c1[s2.charAt(i) - 97]++;
            c1[s1.charAt(i) - 97]--;
        }
        for (int i : c1) {
            if(i < 0){
                return false;
            }
        }
        return true;
    }
    class Solution {
        public boolean CheckPermutation1(String s1, String s2) {
            int[] c1 = new int[26];
            for (int i = 0; i < s1.length(); i++) {
                c1[s1.charAt(i) - 97]++;
            }
            for (int i = 0; i < s2.length(); i++) {
                c1[s2.charAt(i) - 97]--;
            }
            for (int i : c1) {
                if(i != 0){
                    return false;
                }
            }
            return true;
        }
    }
}
