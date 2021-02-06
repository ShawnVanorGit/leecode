package 动态规划.medium;

/**
 * @Author Natasha
 * @Description
 * @Date 2021/2/6 13:41
 **/
public class 一次编辑 {
    public static boolean oneEditAway(String first, String second) {
        int a = first.length();
        int b = second.length();
        if (Math.abs(a - b) >= 2) {
            return false;
        }
        if (b > a) {
            return oneEditAway(second, first);
        }
        for (int i = 0; i < b; i++) {
            if (first.charAt(i) != second.charAt(i)) {
                return first.substring(i + 1).equals(second.substring(a == b ? i + 1 : i));
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(oneEditAway("ab", "bc"));
    }
}
