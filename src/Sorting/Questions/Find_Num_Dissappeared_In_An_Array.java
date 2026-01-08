package Sorting.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_Num_Dissappeared_In_An_Array {
    public static void main(String[] args) {
        int[] arr = {1, 6, 3, 5, 4, 6, 2};
        List<Integer> missingNum = findNumbers(arr); //Here we are using list because there can be variable length of array since we don't know how many missing numbers are there.
        System.out.println(missingNum);
    }

    static List<Integer> findNumbers(int[] arr) {
        int i = 0;
        int n = arr.length;

        while (i < n) {
            int correctIndex = arr[i] - 1;

            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }

        }

        System.out.println(Arrays.toString(arr));

        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                ans.add(j + 1);
            }
        }

        return ans;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}


