package array;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Natasha
 * @Description
 * @Date 2020/11/16 17:33
 **/
public class 汇总区间 {
    public static List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if(nums.length == 0){
            return list;
        }
        int tmp = nums[0];
        int cnt = 1;
        int head = tmp;
        int flag = 1;
        StringBuilder sb = new StringBuilder();
        sb.append(head);
        for(int i = 1 ;i < nums.length; i++){
            if(tmp + 1 == nums[i]){
                tmp = nums[i];
                cnt++;
                flag = 1;
                if(cnt <= 2){
                    sb.append("->").append(tmp);
                } else if(cnt > 2){
                    sb = new StringBuilder();
                    sb.append(head).append("->").append(tmp);
                }
            } else {
                list.add(sb.toString());
                cnt = 1;
                tmp = nums[i];
                head = tmp;
                flag = 0;
                sb = new StringBuilder();
                sb.append(head);
            }
        }
        list.add(sb.toString());
        return list;
    }

    public static void main(String[] args) {
        System.out.println(summaryRanges(new int[]{0,1,2,4,5,7}));
    }
}
