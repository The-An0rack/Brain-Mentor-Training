import java.util.Scanner;

public class Que1_InverseSum {
    public static void main(String[] args) {
        System.out.println("Enter value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        System.out.println("Sum: " + sum);
        sc.close();
    }
}
