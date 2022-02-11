public class DiamondDigonalSides {
    static int n = 21;

    public static void main(String[] args) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == n / 2 + 1 || col == n / 2 + 1 || col - row == n / 2 || row - col == n / 2
                        || col + row == (n / 2) * 3 + 2 || col + row == (n / 2) + 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
