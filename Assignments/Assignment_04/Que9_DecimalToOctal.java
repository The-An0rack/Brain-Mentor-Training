import java.util.Scanner;

public class Que9_DecimalToOctal {
    public static void main(String[] args) {
        String res = "";
        System.out.println("Enter decimal: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        while (temp > 0) {
            res = temp % 8 + res;
            temp /= 8;
        }
        System.out.println("Octal Conversion: " + res);
    }
}
