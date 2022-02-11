public class PyramidNumericHalfInverted {
    static int n = 5;

    public static void main(String[] args) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
