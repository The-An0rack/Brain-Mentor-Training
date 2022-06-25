class Fibonacci {
    static int Fib(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        return Fib(n-1) + Fib(n - 2);
    }
    public static void main(String[] args) {
        int n = 10;
        for(int i = 0; i < n; i++) {
            System.out.println(Fib(i));
        }
    }
}