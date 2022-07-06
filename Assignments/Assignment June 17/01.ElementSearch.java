class ElementSearch {
    static int elementSearch(int[] arr,int target, int idx) {
        if(arr.length == idx) {
            return -1;
        }
        if(arr[idx] == target) {
            return idx;
        } else {
            return elementSearch(arr, target, idx +1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println( elementSearch(arr, 11, 0) );
    }
}