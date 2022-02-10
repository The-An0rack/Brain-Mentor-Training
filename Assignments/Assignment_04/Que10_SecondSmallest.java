import java.util.Scanner;

public class Que10_SecondSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.print("Ans: ");
        if ((num1 > num2 && num1 < num3) || (num1 > num3 && num1 < num2)) {
            System.out.println(num1);
        } else if ((num2 > num1 && num2 < num3) || (num2 > num3 && num2 < num1)) {
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }
    }
}
