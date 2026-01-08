package Recursion.Theory.Array;

public class Check_If_Sorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 13, 6, 8, 9, 10, 12};
        System.out.println(recursiveCheckSort(arr, 0));  // Start with index 0;
    }

    static boolean checkSort(int[] arr) {
        int i = 0;
        while (i < arr.length - 1) {
            if (arr[i] < arr[i + 1]) {
                i++;
            } else {
                return false;
            }
        }

        return true;
    }


    static boolean recursiveCheckSort(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;  // We know that if we are checking if the array is sorted or not and if we have reached to the last index, this means the array is sorted.
        }

        return arr[index] < arr[index + 1] && recursiveCheckSort(arr, index + 1);  // If in case of unsorted array, arr[index] < arr[index + 1]  will be false and since we are using && operator, it will not make further recursive call.
    }
}
