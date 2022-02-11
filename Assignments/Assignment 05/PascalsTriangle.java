public class PascalsTriangle {
    static int n = 5;

    public static void main(String[] args) {
        int[][] res = new int[n + 1][n + 2];
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                if (col == 1 || col == row) {
                    res[row - 1][col - 1] = 1;
                    System.out.print(res[row - 1][col - 1] + " ");
                } else {
                    res[row - 1][col - 1] = res[row - 2][col - 1] + res[row - 2][col - 2];
                    System.out.print(res[row - 1][col - 1] + " ");
                }

            }
            System.out.println();
        }
    }
}
