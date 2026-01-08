package Sorting.Questions;

import java.util.Arrays;

public class Missing_Numbers {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1, 2};
        sort(arr);
        System.out.println(findMissing(arr));
    }

    static void sort(int[] arr) {
        int i = 0;
        int n = arr.length;

        while (i < n) {
            int correctIndex = arr[i];
                if (correctIndex < n && arr[i] != arr[correctIndex]) {
                    swap(arr, i, correctIndex);
                } else {
                    i++;
                }
        }

    }

    static int findMissing(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (i != arr[i]) {
                return i;
            }
        }

        return arr.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
