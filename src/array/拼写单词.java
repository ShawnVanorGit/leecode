package array;

import java.util.Arrays;

public class 拼写单词 {
    public static int countCharacters(String[] words, String chars) {
        char[] c = chars.toCharArray();
        char[] crr = new char[26];
        for(int i = 0; i < c.length; i++){
            crr[c[i] - 97]++;
        }
        int cnt = 0;
        for(int i = 0; i < words.length; i++){
            char[] crr1 = Arrays.copyOf(crr, crr.length);
            int n = words[i].toCharArray().length;
            boolean flag = false;
            for(int j = 0; j < n; j++) {
                if(crr1[words[i].charAt(j) - 97] == 0) {
                    flag = true;
                    break;
                }
                crr1[words[i].charAt(j) - 97]--;
            }
            if(!flag){
                cnt += n;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(countCharacters(new String[]{"cat","bt","hat","tree"}, "atach"));
    }
}
