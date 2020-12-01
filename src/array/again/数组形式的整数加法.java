package array.again;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 数组形式的整数加法 {
    public static List<Integer> addToArrayForm(int[] A, int K) {
        int an = A.length - 1;
        List<Integer> list = new ArrayList();
        while(an >= 0 || K > 0){
            if(an >= 0){
                K += A[an--];
            }
            list.add(K % 10);
            K /= 10;
        }
        Collections.reverse(list);
        return list;
    }
    public static List<Integer> addToArrayForm1(int[] A, int K) {
        int an = A.length - 1;
        char[] ck = String.valueOf(K).toCharArray();
        int kn = ck.length - 1;
        int ta = 0;
        int tk = 0;
        int tmp = 0;
        int flag = 0;
        List<Integer> list = new ArrayList();
        while(an >= 0 || kn >= 0){
            ta = an >= 0 ? A[an--] : 0;
            tk = kn >= 0 ? Integer.valueOf(ck[kn--] - 48) : 0;
            tmp = ta + tk + flag;
            flag = tmp / 10;
            list.add(tmp % 10);
        }
        if(flag > 0){
            list.add(flag);
        }
        Collections.reverse(list);
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list = addToArrayForm(new int[]{1,2,0,0}, 34);
        for (int i = 0; i <list.size();i++){
            System.out.printf(list.get(i)+",");
        }
    }
}
