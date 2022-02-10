import java.util.Scanner;

public class Assignment_02_Armstrong_Number {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        int num_of_digits = 0, temp = num;
        while (temp > 0) {
            temp /= 10;
            num_of_digits++;
        }
        temp = num;
        int result = 0;
        while (temp > 0) {
            result += Math.pow(temp % 10, num_of_digits);
            temp /= 10;
        }
        if (num == result)
            System.out.println("It is an armstrong number.");
        else
            System.out.println("It is not an armstrong  number.");
        sc.close();
    }
}
