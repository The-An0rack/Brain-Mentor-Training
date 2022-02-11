public class DiamondHollow {
    static int n = 5;

    public static void main(String[] args) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            for (int col = 1; col <= 2 * (row - 1); col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int row = 2; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            for (int col = 1; col <= 2 * (n - row); col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
