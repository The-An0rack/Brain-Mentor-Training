public class FloydsTriangle {
    static int n = 5;

    public static void main(String[] args) {
        int k = 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }

    }
}
