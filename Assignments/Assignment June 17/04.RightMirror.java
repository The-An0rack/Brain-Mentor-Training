class RightMirror {
    static void rightMirror(int n,int row) {
        if(n == row) {
            printStar(n);
            return;
        }
        rightMirror( n + 1, row);
        printSpace(row - n);
        printStar(n);
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
            System.out.println();
            return;
        }
        System.out.print("* ");
        printStar(n - 1);
    }
    public static void main(String[] args) {
        rightMirror(1, 5);
    }
}