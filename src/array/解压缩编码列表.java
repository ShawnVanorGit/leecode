package array;


import java.util.ArrayList;
import java.util.List;

public class 解压缩编码列表 {
    public int[] decompressRLElist(int[] nums) {
        int j = 0;
        int len = nums.length;
        List<Integer> list = new ArrayList();
        while(j < nums.length){
            len += nums[j];
            j += 2;
        }
        int[] result = new int[len];
        for (int i = 0; i < nums.length; i+=2) {
            int n = nums[i];
            int num = nums[i+1];
            for (int j = 0; j < n; j++) {
                list.add(num);
            }
        }
        return list.stream().mapToInt(Integer::valueOf).toArray();
    }
}
