public class Butterfly {
    static int n = 7;

    public static void main(String[] args) {
        for (int row = 1; row <= n; row++) {
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
        for (int row = 1; row < n; row++) {
            for (int col = 1; col <= n - row % n; col++) {
                System.out.print("* ");
            }
            for (int col = 1; col <= 2 * row; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= n - row % n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
