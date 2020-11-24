package array.again;

import java.util.HashSet;

/**
 * @Author Natasha
 * @Description 公式
 * @Date 2020/11/24 8:41
 **/
public class 公平的糖果交换 {
    public int[] fairCandySwap(int[] A, int[] B) {
        int alice = 0;
        int bob = 0;
        HashSet bobSet = new HashSet();
        for(int a : A){
            alice += a;
        }
        for(int b : B){
            bob += b;
            bobSet.add(b);
        }
        int avg = (bob - alice) / 2;
        for(int a : A){
            int b = a + avg;
            if(bobSet.contains(b)){
                return new int[]{a, b};
            }
        }
        return new int[]{};
    }
}
