import java.util.Scanner;

public class Assignment_02_Decimal2Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        StringBuffer res = new StringBuffer();
        int temp = num;
        while (temp > 0) {
            res.append(temp % 2);
            temp /= 2;
        }
        res.reverse();
        System.out.println("Binary Equivalent of " + num + " is " + res);
        sc.close();
    }
}
