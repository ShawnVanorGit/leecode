package array.again;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @Author Natasha
 * @Description 众数计票法
 * @Date 2020/11/13 19:31
 **/
public class 多数元素 {
    public static int majorityElement(int[] nums) {
        int tmp = nums[0];
        int cnt = 1;
        for(int i = 1 ; i < nums.length ; i++) {
            if(tmp != nums[i]) {
                cnt--;
                if(cnt == 0) {
                    tmp = nums[i];
                    cnt = 1;
                }
            } else {
                cnt++;
            }
        }
        return tmp;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
    }

    public int majorityElement1(int[] nums) {
        int n = nums.length / 2;
        Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if(map.get(nums[i]) >= n){
                return nums[i];
            }
        }
        return -1;
    }
}
