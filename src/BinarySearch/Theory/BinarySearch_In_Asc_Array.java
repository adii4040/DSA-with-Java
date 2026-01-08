package BinarySearch.Theory;

public class BinarySearch_In_Asc_Array {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = -12;
        int ans = binarySearchAsc(arr, target);
        System.out.println(ans);
    }

    //Binary search is always perform on the sorted arrays.
    static int binarySearchAsc(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            // find the middle element
//          int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;


            if (target < nums[mid]) { // if the targeted element is on the left side of the middle element
                end = mid - 1;
            } else if (target > nums[mid]) { // if the targeted element is on the right side of the middle element
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }


}
