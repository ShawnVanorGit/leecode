package array.unkonw;
/*
* 第一个for是为了防止出现 0 6 0
* 第二个for为了防止出现都是0，（j>=arr.length)
* */
public class 复写零 {
    public static int[] duplicateZeros(int[] arr) {
        int i = 0;
        int j = 0;
        while(j < arr.length){
            if(arr[i] == 0){
                j++;
            }
            i++;
            j++;
        }
        i--;
        j--;
        while(i >= 0){
            if(j < arr.length){
                arr[j] = arr[i];
            }
            if(arr[i] == 0){
                arr[--j] = arr[i];
            }
            i--;
            j--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = duplicateZeros(new int[]{0,0,0,0,0,0,0});
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
