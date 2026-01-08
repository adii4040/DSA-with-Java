package Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4, 6};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

//    static void cyclicSort(int[] arr) {
//        int i = 0;
//        int n = arr.length;
//        while (i < n) {
//            if (arr[i] != i + 1) {
//                swap(arr, i, arr[i] - 1);
//            } else {
//                i++;
//            }
//        }
//    }


    //PROPER APPROACH FOR THIS

    static void cyclicSort(int[] arr) {
        int i = 0;
        int n = arr.length;

        while (i < n) {
            int correctIndex = arr[i] - 1;  //This is correctIndex because the array is from 1 - N so  every element will be at index = element - 1, Example 4 will be at 3rd index -> 4-3.
            //Therefor the currentIndex and correctIndex will be same, if they are different this means they are not sorted.


            //Check if the element at the current index is equal to the element at correctIndex

            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }

        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
