package BinarySearch.Questions.Medium;

public class Peak_Index_In_a_mountain_array {
    public static void main(String[] args) {
        int[] arr = {4, 5, 7, 8, 3, 2, 1};
        int[] arr2 = {24, 69, 100, 99, 79, 78, 67, 36, 26, 19};
        System.out.println(peakIndexInMountainArray(arr2));
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                if (arr[mid] > arr[mid - 1]) {
                    return mid;
                }
                end = mid - 1;

            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
