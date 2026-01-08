package Recursion.Theory.SORT;

import java.util.Arrays;

public class QuickSORT {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 6, 2, 1};
        quick(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    static void quick(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int s = low;
        int e = high;
        int pivot = s + (e - s) / 2;

        while (s <= e) {

            while (arr[s] < arr[pivot]) {
                s++;
            }
            while (arr[e] > arr[pivot]) {
                e--;
            }

            //also a reason why if its already sorted it will not swap
            if (s <= e) {
                swap(arr, s, e);
                s++;
                e--;
            }
        }

        quick(arr, s, high);
        quick(arr, low, e);
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
