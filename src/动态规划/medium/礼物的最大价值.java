package 动态规划.medium;

/**
 * @Author Natasha
 * @Description
 * @Date 2021/2/1 14:05
 **/
public class 礼物的最大价值 {
    public static int maxValue(int[][] grid) {
        int x = grid.length;
        int y = grid[0].length;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if(i == 0 && j == 0){
                    continue;
                }else if (i == 0) {
                    grid[i][j] += grid[i][j - 1];
                } else if (j == 0) {
                    grid[i][j] += grid[i - 1][j];
                } else{
                    grid[i][j] += Math.max(grid[i][j - 1], grid[i - 1][j]);
                }
            }
        }
        return grid[x - 1][y - 1];
    }

    public static void main(String[] args) {
        System.out.println(maxValue(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}));
    }
}
