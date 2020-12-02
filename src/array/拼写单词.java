package array;

import java.util.HashMap;

public class 拼写单词 {
    public int countCharacters(String[] words, String chars) {
        HashMap<Integer, Integer> map = new HashMap<>();
        char[] ch = new char[26];
        char[] c = chars.toCharArray();
        for(int i = 0; i < c.length; i++){
            ch[c[i] - 97]++;
        }

    }
}
