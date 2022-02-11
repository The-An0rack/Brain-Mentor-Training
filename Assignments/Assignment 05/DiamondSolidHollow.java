public class DiamondSolidHollow {
    static int n = 5;

    public static void main(String[] args) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row; col++) {
                if (col == 1 || col == row) {
                    System.out.print("*   ");
                } else {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= n - row + 1; col++) {
                if (col == 1 || col == n - row + 1) {
                    System.out.print("*   ");
                } else {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
    }
}
