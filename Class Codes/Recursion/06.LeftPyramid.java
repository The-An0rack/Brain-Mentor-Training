class LeftPyramid {
    static void leftPyramid(int n) {
        if(n == 0) {
            return;
        }
        leftPyramid(n - 1);
        printRow(n);
        System.out.println();
    }
    static void printRow(int n) {
        if(n == 0) {
            return;
        }
        System.out.print("* ");
        printRow(n - 1);
    }
    public static void main(String[] args) {
        leftPyramid(5);
    }
}