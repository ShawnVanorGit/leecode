package array;


public class 解压缩编码列表 {
    public int[] decompressRLElist(int[] nums) {
        int i = 0;
        while(i < nums.length){
            len += nums[i];
            i += 2;
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
