class SumOfDigits {
    static int sum(int num) {
        if(num == 0) {
            return 0;
        }
        int unitDigit = num % 10;
        return unitDigit + sum(num / 10);
    }

    public static void main(String[] args) {
        System.out.println(sum(12355));
    }
}