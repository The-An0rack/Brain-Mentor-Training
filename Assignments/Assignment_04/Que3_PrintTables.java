import java.util.Scanner;

public class Que3_PrintTables {
    public static void main(String[] args) {
        System.out.println("Enter value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= n; j++) {
                if (j != 1)
                    System.out.print(",");
                System.out.print(" " + j + " x " + i + " = " + (j * i));
            }
            System.out.println();
        }
    }
}
