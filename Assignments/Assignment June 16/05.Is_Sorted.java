class IsSorted {
    static boolean isSorted(int[] arr, int i) {
        if(i == arr.length) {
            return true;
        }
        if(arr[i-1] > arr[i]) {
            return false;
        } else {
            return isSorted(arr, i + 1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,0};
        System.out.println(isSorted(arr, 1));
    }
}