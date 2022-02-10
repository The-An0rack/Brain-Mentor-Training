import java.util.Scanner;

public class Assignment_02_ReverseNumber {
    public static void main(String[] args) {
        int num, result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        int temp = num;
        while (temp > 0) {
            result = result * 10 + temp % 10;
            temp /= 10;
        }
        System.out.println("Number " + num + " when reversed is " + result);
        sc.close();
    }
}
