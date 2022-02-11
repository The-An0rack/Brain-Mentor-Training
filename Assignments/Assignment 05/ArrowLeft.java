public class ArrowLeft {
    static int n = 9;

    public static void main(String[] args) {
        for (int row = 1; row <= n / 2 + 1; row++) {
            for (int col = 1; col <= n / 2 + 1; col++) {
                if (col == (n / 2 + 3) - row) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        for (int row = 1; row <= n / 2 + 1; row++) {
            for (int col = 1; col <= n / 2 + 1; col++) {
                if (col == row) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
