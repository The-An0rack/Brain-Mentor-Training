class CountZero {
    static int Count(int num) {
        if(num == 0) {
            return 0;
        }
        int unitDigit = num % 10;
        if(unitDigit == 0) {
            return 1 + Count(num/10);
        } else {
            return 0 + Count(num / 10);
        }
    }
    public static void main(String[] args) {
        System.out.println(Count(1209803));
    }
}