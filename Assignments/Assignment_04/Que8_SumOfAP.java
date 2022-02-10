import java.util.Scanner;

public class Que8_SumOfAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of starting: ");
        int a = sc.nextInt();
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter common difference of elements: ");
        int d = sc.nextInt();

        int res = (n * (2 * a + (n - 1) * d)) / 2;
        System.out.println("Result: " + res);

    }
}
