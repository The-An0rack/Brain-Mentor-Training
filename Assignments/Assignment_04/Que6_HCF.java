import java.util.Scanner;

public class Que6_HCF {
    static int calculateGCD(int num1, int num2) {
        if (num2 == 0)
            return num1;
        else
            return calculateGCD(num2, num1 % num2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2: ");
        int num2 = sc.nextInt();
        System.out.println("HCF: " + ((num1 > num2) ? calculateGCD(num1, num2) : calculateGCD(num2, num1)));
    }
}
