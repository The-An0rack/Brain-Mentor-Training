import java.util.Scanner;

public class Que2_RectanglePattern {
    public static void main(String[] args) {
        System.out.println("Enter value of rows and columns: ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
