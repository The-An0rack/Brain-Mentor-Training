public class PyramidNumericHalfHollow {
    static int n = 5;

    public static void main(String[] args) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                if (row == 1 || row == n || col == 1 || col == n || row == col) {
                    System.out.print(col + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
