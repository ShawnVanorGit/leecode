package array.again;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author Natasha
 * @Description 原地往后挪效率会更高
 * @Date 2020/12/10 9:38
 **/
public class 按既定顺序创建目标数组 {
    public static int[] createTargetArray(int[] nums, int[] index) {
        for (int i = 0; i < index.length; i++) {
            if(i > index[i]){
                int tmp = nums[i];
                for(int j = i - 1; j >= index[i]; j--){
                    nums[j + 1] = nums[j];
                }
                nums[index[i]] = tmp;
            }
        }
        return nums;
    }

    public static int[] createTargetArray1(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }
        return list.stream().mapToInt(Integer::valueOf).toArray();
    }

    public static void main(String[] args) {
        Arrays.stream(createTargetArray(new int[]{0,1,2,3,4}, new int[]{0,1,2,2,1})).boxed().forEach(e -> System.out.println(e));
    }
}
