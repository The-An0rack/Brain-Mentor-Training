import java.util.Scanner;

public class Assignment_02_Decimal2Hexa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        StringBuffer res = new StringBuffer();
        String c;
        int temp = num;
        while (temp > 0) {
            if (temp % 16 < 10)
                res.append(temp % 16);
            else {
                switch (temp % 16) {
                    case 10:
                        c = "A";
                        break;
                    case 11:
                        c = "B";
                        break;
                    case 12:
                        c = "C";
                        break;
                    case 13:
                        c = "D";
                        break;
                    case 14:
                        c = "E";
                        break;
                    case 15:
                        c = "F";
                        break;
                    default:
                        c = "X";

                }
                res.append(c.toString());
            }

            temp /= 16;
        }
        res.reverse();
        System.out.println("Hex Equivalent of " + num + " is " + res);
        sc.close();
    }
}
