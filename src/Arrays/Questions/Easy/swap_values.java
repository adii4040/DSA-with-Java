package Arrays.Questions.Easy;

import java.util.Arrays;

public class swap_values {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 9, 2, 3, 1};
        System.out.println("Before " + Arrays.toString(arr));
        swap(arr, 0, 1);
        System.out.println("After swap " + Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

