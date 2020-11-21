package array.again;

import java.util.HashSet;

public class 存在重复元素II {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < nums.length; i ++){
            if(set.size() <= k && set.contains(nums[i])){
                return true;
            }
            if(set.size() == k){
                set.remove(nums[i - k]);
            }
            set.add(nums[i]);
        }
        return false;
    }
}
