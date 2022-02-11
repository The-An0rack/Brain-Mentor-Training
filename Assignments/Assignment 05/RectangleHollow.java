import java.util.Scanner;

public class RectangleHollow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        for (int row = 1; row <= m; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1 || row == m || col == 1 || col == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
