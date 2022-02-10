import java.util.Scanner;

public class Assignment_03_Pattern_HalfRightPyramidInverted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
