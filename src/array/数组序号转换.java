package array;


import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author Natasha
 * @Description
 * @Date 2020/12/8 11:18::
 **/
public class 数组序号转换 {
    public static int[] arrayRankTransform(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] a = arr.clone();
        Arrays.sort(a);
        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
            if(!map.containsKey(a[i])){
                map.put(a[i], cnt++);
            }
            if(i + 1 < a.length && a[i + 1] == a[i]){
                i++;
            }

        }
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = map.get(arr[i]) + 1;
        }
        return res;
    }

    public static int[] arrayRankTransform1(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int a : arr) {
            set.add(a);
        }
        List<Integer> list = set.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = list.indexOf(arr[i]) + 1;
        }
        return res;
    }

    public static void main(String[] args) {
        Arrays.stream(arrayRankTransform(new int[]{37,12,28,9,100,56,80,5,12})).boxed().collect(Collectors.toList()).stream().forEach(e -> System.out.println(e));

    }
}
