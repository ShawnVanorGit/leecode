package array.again;

/**
 * @Author Natasha
 * @Description 辗转相除法
 * @Date 2020/11/24 13:58
 **/
public class 卡牌分组 {
    public boolean hasGroupsSizeX(int[] deck) {
        int[] arr = new int[10001];
        for(int num : deck){
            arr[num]++;
        }
        int x = arr[0];
        for(int i = 1; i < arr.length;i ++){
            if(arr[i] != 0){
                x = gcd(x, arr[i]);
                if(x == 1){
                    return false;
                }
            }
        }
        return x >= 2;
    }

    //辗转相除法
    private int gcd (int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
