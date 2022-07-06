class NumberPattern {
    static int a = 1;
    static void numberPattern(int n) {
        if(n == 0) {
            return;
        }
        numberPattern(n-1);
        printRow(1,n);
    }
    static void printRow(int i, int n) {
        if(i == n) {
            System.out.println(a++ + " ");
            return;
        }
        System.out.print(a++ + " ");
        printRow(i + 1,n);
    }
    public static void main(String[] args) {
        numberPattern(5);
    }
}