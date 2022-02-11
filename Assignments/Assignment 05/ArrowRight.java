public class ArrowRight {
    static int n = 9;

    public static void main(String[] args) {
        for (int row = 1; row <= n / 2; row++) {
            for (int col = 1; col <= n / 2 + row; col++) {
                if (col == n / 2 + row) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int row = 1; row <= n / 2; row++) {
            for (int col = 1; col <= n - row; col++) {
                if (col == n - row) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
