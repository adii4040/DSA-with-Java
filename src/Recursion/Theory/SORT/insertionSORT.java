package Recursion.Theory.SORT;

import java.util.Arrays;

public class insertionSORT {
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 1, 6, 8, 4};
        recInsert(arr, 0, 1);
        System.out.println(Arrays.toString(arr));
    }

    static void recInsert(int[] arr, int s, int e) {
        if (e >= arr.length) {
            return;
        }
        int j = e;
        while (j > s) {
            if (arr[j - 1] > arr[j]) {
                swap(arr, j, j - 1);
                j--;
            } else {
                break;
            }
        }

        recInsert(arr, s, e + 1);
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
