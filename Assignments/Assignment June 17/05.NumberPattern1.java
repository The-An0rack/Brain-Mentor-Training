class NumberPattern {
    static void numberPattern(int n) {
        if(n == 0) {
            return;
        }
        numberPattern(n-1);
        printRow(1,n);
    }
    static void printRow(int i, int n) {
        if(i == n) {
            System.out.println(n + " ");
            return;
        }
        System.out.print(n + " ");
        printRow(i + 1, n);
    }
    public static void main(String[] args) {
        numberPattern(5);
    }
}