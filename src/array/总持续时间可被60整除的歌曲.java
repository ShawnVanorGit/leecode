package array;

import java.util.HashMap;

/**
 * @Author Natasha
 * @Description
 * @Date 2020/12/2 10:51
 **/
public class 总持续时间可被60整除的歌曲 {
    public static int numPairsDivisibleBy60(int[] time) {
        int cnt = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int t : time) {
            int num = t > 60 ? t % 60 : t;
            map.put(num, map.getOrDefault(num, 0) + 1);

            if(map.containsKey(60 - num) || map.containsKey(60)){
                if(t == 60){
                    cnt += map.get(60);
                    map.put(60, 0);
                }else{
                    cnt += map.get(60 - num);
                    map.put(60 - num, 0);
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        System.out.println(numPairsDivisibleBy60(new int[]{174,188,377,437,54,498,455,239,183,347,59,199,52,488,147,82}));
    }
}
