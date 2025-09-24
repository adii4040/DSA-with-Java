package BinarySearch.Theory;

public class BinarySearch_In_Desc_Array {
    public static void main(String[] args) {
        int[] arr = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        int target =-3;
        int ans = binarySearchDesc(arr, target);
        System.out.println(ans);
    }

    static int binarySearchDesc(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the middle element
//          int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;


            //In case of descending sorted array,
            if (target > arr[mid]) { // if the targeted element is on the left side of the middle element, then it means it is greater than the middle element
                end = mid - 1;
            } else if (target < arr[mid]) { // if the targeted element is on the right side of the middle element, then it means it is smaller than the middle element
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
