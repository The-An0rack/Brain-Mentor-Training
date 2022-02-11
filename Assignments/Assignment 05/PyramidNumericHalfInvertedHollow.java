public class PyramidNumericHalfInvertedHollow {
    static int n = 5;

    public static void main(String[] args) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                if (row == 1 || row == n || col == 1 || col == n || col == n - row + 1) {
                    System.out.print(col + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
