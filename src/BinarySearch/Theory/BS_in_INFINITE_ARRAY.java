package BinarySearch.Theory;

public class BS_in_INFINITE_ARRAY {
    public static void main(String[] args) {

        //Assume we have a sorted array with infinite number of elements, and we can not use the arr.length to find the solution since this is infinity array.

        //Since the array is sorted, we will use the binary search.
        int[] arr = {2, 3, 4, 6, 7, 9, 10, 12, 14, 16, 19, 22, 24, 26, 28, 32, 44, 46, 49, 52, 58, 59, 60, 63, 64, 66, 69, 72, 74, 76, 79, 80, 85, 86, 89, 90, 91, 92, 94, 95, 96, 98, 99, 100, 102, 104, 108, 109, 110, 112, 114, 116, 118, 120, 122, 124, 126, 128, 130};
        //index   = {0, 1, 2, 3, 4, 5,  6,  7,  8,  9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39 ,40, 41, 42, 43, 44 ,45 ,46, 47 ,48 ,49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 62, 63 ,64}
        int target = 9;
        System.out.println(infiniteBS(arr, target));
    }

    static int infiniteBS(int[] arr, int target) {


        //Instead of normal approach of BS, start and end with the last element of the array, we will not use that approach as this is infinite array with no known length.

        // end = arr.length,  we cant take this as array is infinite, instead we will find the target element in chunks.


        // first we will start from index 0 and end = 1, length of 2, and check if the target is inside this range, if not then next ---
        // next, we will start = 2 and end = 5, length of 4, and check if the target is inside this range, if not then next ---
        // next, start = 6 and end = 13, length of 8 and so on until we find the target inside the range, if not then next ---

        // initially we will have range of 2, and if we don't find the targeted element in the given range we will double the range of start and end with
        // start = end + 1,
        // end = start + range - 1

//        int range = 2;
//        int start = 0;
//        int end = start + range - 1;
//
//        while (start <= end) {
//            if (target <= arr[end]) {
//                return binarySearch(arr, target, start, end);
//            } else {
//                range *= 2;
//                start = end + 1;
//                end = start + range - 1;
//            }
//        }
//        return -1;


        //BETTER WAY TO DO THE ABOVE

        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            //newStart will be one more than the previous end
            int newStart = end + 1;

            //double the range => range - (end - start + 1) * 2 // to know more about this check the theory of size in range of arrays

            // new end will be previousEnd + double the  range size
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
