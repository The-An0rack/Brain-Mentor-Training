class AlphabetPattern {
    static void alphabetPattern(int n) {
        if(n == 0) {
            return;
        }
        alphabetPattern(n - 1);
        printRow(n);
    }
    static void printRow(int n) {
        if(n == 0) {
            System.out.println();
            return ;
        }
        printRow(n - 1);
        System.out.print((char)(n + 64) + " ");
    }
    public static void main(String[] args) {
        alphabetPattern(5);
    }
}