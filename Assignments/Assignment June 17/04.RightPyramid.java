class RightPyramid {
    static void rightPyramid(int n,int row) {
        if(n == row) {
            printStar(n);
            return;
        }
        printSpace(row - n);
        printStar(n);
        System.out.println();
        rightPyramid( n + 1, row);
    }
    static void printSpace(int n) {
        if(n == 0) {
            return;
        }
        System.out.print("  ");
        printSpace( n - 1);
    }
    static void printStar(int n) {
        if(n == 0) {
            return;
        }
        System.out.print("* ");
        printStar(n - 1);
    }
    public static void main(String[] args) {
        rightPyramid(1, 5);
    }
}