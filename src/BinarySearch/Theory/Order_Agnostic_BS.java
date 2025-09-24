package BinarySearch.Theory;

public class Order_Agnostic_BS {
    public static void main(String[] args) {
        //int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int[] arr = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        int target = -3;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        //First determine if the given array is ascending or not?
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        System.out.println(isAsc);
//        if (arr[start] < arr[end]) {
//            isAsc = true;
//        } else {
//            isAsc = false;


        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) return mid;
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

}
