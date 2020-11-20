package array;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Natasha
 * @Description
 * @Date 2020/11/13 15:30
 **/
public class 杨辉三角 {
    public static List<Integer> generate(int rowIndex) {
        List<List<Integer>> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list1.add(list2);

        for(int i = 0; i < rowIndex; i++){
            List<Integer> list3 = new ArrayList<>();
            list3.add(1);
            int n = list1.get(i).size();
            List<Integer> l = list1.get(i);
            for(int j = 1 ; j < n; j++){
                list3.add(l.get(j - 1) + l.get(j));
            }
            list3.add(1);
            list1.add(list3);
        }
        return list1.get(rowIndex);
    }
    public static void main(String[] args) {
        System.out.println(generate(0));
    }
}
