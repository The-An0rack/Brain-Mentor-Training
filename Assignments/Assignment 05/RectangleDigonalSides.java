public class RectangleDigonalSides {
    static int m = 7;
    static int n = 7;

    public static void main(String[] args) {
        for (int row = 1; row <= m; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1 || col == 1 || row == m || col == n || row == col || col == n - row + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
