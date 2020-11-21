package array;

public class 合并两个有序数组 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m + n - 1;
        m -= 1;
        n -= 1;
        while(m >= 0 && n >= 0) {
            if(nums1[m] >= nums2[n]){
                nums1[k--] = nums1[m--];
            } else{
                nums1[k--] = nums2[n--];
            }
        }
        if(n >= 0){
            for(int i = 0 ; i <= n; i ++){
                nums1[i] = nums2[i];
            }
        }
    }
}
