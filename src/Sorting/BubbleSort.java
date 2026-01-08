package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {5, 2, 3, 4, 3, 8, 4};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        boolean isSwap;

        // run the steps n-1 times.
        for (int i = 0; i < arr.length - 1; i++) {
            isSwap = false;
            // for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than the previous one
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    isSwap = true;
                }
            }
            // if the array is already sorted, this means they will not swap and there is no point in checking for further i's so check if the swap happened or not if not, just break the loop.
            if (!isSwap) {
                break;
            }
        }
    }


}
