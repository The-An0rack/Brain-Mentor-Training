import java.util.Scanner;

public class Que4_RangeArmstrong {
    static int countNumberOfDigits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    static boolean isArmstrong(int n, int d) {
        int temp = n;
        int res = 0;
        while (temp > 0) {
            res += Math.pow(temp % 10, d);
            temp /= 10;
        }
        return n == res;
    }

    public static void main(String[] args) {
        System.out.println("Enter starting number: ");
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        System.out.println("Enter ending number: ");
        int end = sc.nextInt();
        for (int i = start; i <= end; i++) {
            int digits = countNumberOfDigits(i);
            if (isArmstrong(i, digits)) {
                System.out.print(i + " ");
            }

        }
    }
}
