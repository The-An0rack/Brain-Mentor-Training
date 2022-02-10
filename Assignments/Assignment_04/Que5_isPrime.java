import java.util.Scanner;

public class Que5_isPrime {
    static boolean isPrime(int n) {
        if (n == 1)
            return true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            if (isPrime(i))
                System.out.println(i + " ");
        }
    }
}