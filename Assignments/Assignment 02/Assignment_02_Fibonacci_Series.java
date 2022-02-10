public class Assignment_02_Fibonacci_Series {
    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.println("Fibonacci Series Elements: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(a + " ");
            b = a + b;
            a = b - a;
        }
    }
}
