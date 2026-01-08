package Recursion.Theory.SORT;

import java.util.Arrays;

public class BubbleSORT {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1, 5, 8, 6, 9, 10, 15, 14, 12, 18, 20, 50};
        //bubbleSort(arr);
        recBubbleSort(arr, arr.length, 1);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        boolean ifSwap;
        for (int i = 0; i < arr.length; i++) {
            ifSwap = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j - 1, j);
                    ifSwap = true;
                }

            }
            if (!ifSwap) {
                break;
            }
        }
    }

    static void recBubbleSort(int[] arr, int i, int j) {
        if (i == 1) {
            return;
        }

        if (j < i) {
            if (arr[j] < arr[j - 1]) {
                swap(arr, j - 1, j);
            }
            recBubbleSort(arr, i, j + 1);
        } else {
            recBubbleSort(arr, i - 1, 1);
        }
    }


    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
