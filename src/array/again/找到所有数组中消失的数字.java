package array.again;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author Natasha
 * @Description  通过索引来找到确实的数字
 *               对于随机访问get和set，ArrayList觉得优于LinkedList，因为LinkedList要移动指针。
 *               对于新增和删除操作add和remove，LinedList比较占优势，因为ArrayList要移动数据。
 * @Date 2020/11/18 8:37
 **/
public class 找到所有数组中消失的数字 {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i = 0 ;i < nums.length; i++){
            int idx = Math.abs(nums[i]) - 1;
            if(nums[idx] > 0){
                nums[idx] *= -1;
            }
        }
        List<Integer> list = new LinkedList<>();
        for(int i = 0 ;i < nums.length; i++){
            if(nums[i] > 0){
                list.add(i + 1);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
    }
}
