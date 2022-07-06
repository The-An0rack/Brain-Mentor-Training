class LeftPyramidInverted {
    static void leftPyramidInverted(int n) {
        if(n == 0) {
            return;
        }
        printRow(n);
        System.out.println();
        leftPyramidInverted(n - 1);
    }
    static void printRow(int n) {
        if(n == 0) {
            return;
        }
        System.out.print("* ");
        printRow(n - 1);
    }
    public static void main(String[] args) {
        leftPyramidInverted(5);
    }
}