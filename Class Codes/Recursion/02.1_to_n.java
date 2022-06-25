class LearnRecursion{
    static void show(int n) {
        if(n == 0) {
            return;
        }
        show(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        show(5);
    }
}