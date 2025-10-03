package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {5,2,3,4,3,8,4};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        boolean isSwap ;

        for (int i = 0; i < arr.length - 1; i++) {
            isSwap = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    isSwap =  true;
                }
            }

            if(!isSwap){
                break;
            }
        }
    }
}
