package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @Author Natasha
 * @Description 题意解析：字母在每个字符串中出现的最少次数
 * @Date 2020/11/30 10:19
 **/
public class 查找常用字符 {
    public static List<String> commonChars(String[] A) {
        int[] arr = new int[26];
        Arrays.fill(arr, Integer.MAX_VALUE);
        for (String a : A) {
            int[] tmp = new int[26];
            int n = a.length();
            for(int j = 0; j < n; j++){
                tmp[a.charAt(j) - 97]++;
            }
            for(int j = 0; j < 26; j++){
                arr[j] = Math.min(arr[j], tmp[j]);
            }
        }
        List<String> list = new ArrayList<>();
        for(int j = 0; j < 26; j++){
            while (arr[j] > 0){
                list.add(String.valueOf((char)(j + 97)));
                arr[j]--;
            }
        }
        return list;
    }
    public static List<String> commonChars1(String[] A) {
        int[] minfreq = new int[26];
        Arrays.fill(minfreq, Integer.MAX_VALUE);
        for (String word: A) {
            int[] freq = new int[26];
            int length = word.length();
            for (int i = 0; i < length; ++i) {
                char ch = word.charAt(i);
                ++freq[ch - 'a'];
            }
            for (int i = 0; i < 26; ++i) {
                minfreq[i] = Math.min(minfreq[i], freq[i]);
            }
        }

        List<String> list = new ArrayList<>();
        for(int i = 0; i < 26; i++){
            for (int j = 0; j < minfreq[i]; j++) {
                list.add(String.valueOf((char)(i + 97)));
            }
        }
        return list;
    }


    public static void main(String[] args) {
        List<String> list = commonChars(new String[]{"bella","label","roller"});
        for (int i = 0; i <list.size();i++){
            System.out.printf(list.get(i)+",");
        }
    }
}
