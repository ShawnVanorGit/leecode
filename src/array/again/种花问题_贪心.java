package array.again;

/**
 * @Author Natasha
 * @Description
 * @Date 2020/10/15 18:50
 **/
public class 种花问题_贪心 {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int[] newFlow = new int[flowerbed.length + 2];
        for(int i = 0; i < flowerbed.length; i ++){
            newFlow[i + 1] = flowerbed[i];
        }
        for(int i = 1 ; i < newFlow.length - 1; i ++){
            if(newFlow[i - 1] == 0 && newFlow[i] == 0 && newFlow[i + 1] == 0){
                n--;
                newFlow[i]= 1;
            }
        }

        return n <= 0;
    }

    public static void main(String[] args) {
        int[] test = {1,0,0,0,1};
        System.out.println(canPlaceFlowers(test, 2));
    }
}
