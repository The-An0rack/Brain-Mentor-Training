import java.util.Scanner;

public class Assignment_03_digit_in_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String res = "";
        while (num > 0) {
            switch (num % 10) {
                case 0:
                    res = "Zero " + res;
                    break;
                case 1:
                    res = "One " + res;
                    break;
                case 2:
                    res = "Two " + res;
                    break;
                case 3:
                    res = "Three " + res;
                    break;
                case 4:
                    res = "Four " + res;
                    break;
                case 5:
                    res = "Five " + res;
                    break;
                case 6:
                    res = "Six " + res;
                    break;
                case 7:
                    res = "Seven " + res;
                    break;
                case 8:
                    res = "Eight " + res;
                    break;
                case 9:
                    res = "Nine " + res;
                    break;
            }
            num /= 10;
        }
        System.out.println(res);
        sc.close();
    }
}
