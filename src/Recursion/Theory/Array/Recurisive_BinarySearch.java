package Recursion.Theory.Array;

public class Recurisive_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 12, 16, 18, 22, 45, 89};
        int target = 12;
        System.out.println(recBS(arr, 0, arr.length - 1, target));
    }

    static int recBS(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (target < arr[mid]) {
            return recBS(arr, start, mid - 1, target);
        }
        return recBS(arr, mid + 1, end, target);

    }
}
