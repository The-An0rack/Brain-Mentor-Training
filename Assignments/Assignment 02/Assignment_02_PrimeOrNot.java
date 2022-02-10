import java.util.Scanner;

class Assignment_02_PrimeOrNot {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to be tested: ");
        num = sc.nextInt();
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("It is a composite number");
                return;
            }
        }
        System.out.println("It is a prime number");
        sc.close();
    }
}