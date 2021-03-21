import java.util.Arrays;

public class GenerateMatrix {
    public static int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        boolean[][] visited = new boolean[n][n];
        int x = 0;
        int y = 0;
        int num = 1;
        result[x][y] = num++;
        visited[x][y] = true;
        int index = 1;
        while (index <= (n - 1) / 2 + 1) {
            while (y + 1 < n && visited[x][y + 1] != true) {
                visited[x][++y] = true;
                result[x][y] = num++;
            }
            while (x + 1 < n && visited[x + 1][y] != true) {
                visited[++x][y] = true;
                result[x][y] = num++;
            }
            while (y - 1 >= 0 && visited[x][y - 1] != true) {
                visited[x][--y] = true;
                result[x][y] = num++;
            }
            while (x - 1 >= 0 && visited[x - 1][y] != true) {
                visited[--x][y] = true;
                result[x][y] = num++;
            }
            index++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] result = generateMatrix(3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(result[i][j]);
            }
        }
    }
}
