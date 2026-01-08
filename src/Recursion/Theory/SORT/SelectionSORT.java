package Recursion.Theory.SORT;

import java.util.Arrays;

public class SelectionSORT {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1, 5, 8, 6, 9, 10, 15, 14, 12, 18, 20, 50};
        //recSelectionSort(arr, 0);
        recursiveSelectionSort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int maxIndex = findMaxIndex(arr, n - 1 - i);
            int correctIndex = n - 1 - i;
            swap(arr, maxIndex, correctIndex);
        }
    }


    //Here I used the findMaxIndex method, but try to find the max recursively
    static void recSelectionSort(int[] arr, int i) {
        int n = arr.length;
        if (i == n) {
            return;
        }

        int maxIndex = findMaxIndex(arr, n - 1 - i);
        int correctIndex = n - 1 - i;
        swap(arr, maxIndex, correctIndex);
        recSelectionSort(arr, i + 1);
    }

    static int findMaxIndex(int[] arr, int last) {
        int maxIndex = 0;
        for (int i = 0; i <= last; i++) {
            if (arr[maxIndex] < arr[i]) {
                maxIndex = i;
            }
        }

        return maxIndex;
    }


    //Selection sort without using the findMaxIndex method.
    static void recursiveSelectionSort(int[] arr, int r, int c, int maxIndex) {
        if (r == 1) {
            return;
        }

        //r is used to iterate after each time array gets sorted
        //c is used to iterate the over the element to find the maxIndex.
        if (c < r) {
            if (arr[maxIndex] < arr[c]) {
                recursiveSelectionSort(arr, r, c + 1, c);
            }else{
                recursiveSelectionSort(arr, r, c + 1, maxIndex);
            }
        } else {
            //if c is greater than r this means we have iterated over each element in the array, and we are out the array thus we have our maxIndex now.
            //now we need to just swap the max element with its correct place, which is the last place after each recursive call.

            int correctIndex = r - 1;
            swap(arr, maxIndex, correctIndex);
            recursiveSelectionSort(arr, r - 1, 0, 0);
        }

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
