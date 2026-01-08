package Recursion.Theory.SORT;

import java.util.Arrays;

public class MergeSORT {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1, 5, 8, 6, 9, 10, 15, 14, 12, 18, 20, 50};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr) {
        //After continuous division of array, when the length of the array will be 1, then just return the array -  the single element.  This will be either left or right.
        if (arr.length == 1) {
            return arr;
        }

        //Divide the array into 2 parts and sort each part separately and later merge it.
        int mid = arr.length / 2;

        //Create a new subArray containing the left half of the array. Arrays.copyOfRange( ) is used to create the copy of the array with the given range.
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));

        //Create a new subArray containing the right half of the array.

        //Until we don’t get the left part, we won’t get the right part.Because the right call only happens after the left call returns. That’s why recursion explores one full branch (left) first before moving to the next (right).
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));


        //After hitting the base condition we get a subArray from both left and right and  we pass them to merge().
        return merge(left, right);
    }

    //This function is used to merge the two subArray into one new sorted array.
    static int[] merge(int[] firstHalf, int[] secondHalf) {

        int[] mix = new int[firstHalf.length + secondHalf.length];

        int i = 0; //This pointer is used to iterate over the firstHalf array
        int j = 0; //This pointer is used to iterate over the secondHalf array
        int k = 0; //This pointer is used to iterate and add the value in the mix array from the firstHalf and secondHalf


        //Until the value of i and j is less than length of firstHalf and secondHalf respectively, we will add their value in the mix based on the condition.
        //Once one of them or both are greater than their lengths, this means there is no element left to add.
        while (i < firstHalf.length && j < secondHalf.length) {

            //Check if the element at i'th positon of firstHalf array is greater than or smaller than the element at j'th position of secondHalf array.

            if (firstHalf[i] < secondHalf[j]) {
                //If firstHalf element is smaller than the secondHalf element, add the firstHalf element in the mix array and increment the value of i and k.
                mix[k] = firstHalf[i];
                i++;
            } else {
                //If firstHalf element is greater than the secondHalf element, add the secondHalf element in the mix array and increment the value of j and k.
                mix[k] = secondHalf[j];
                j++;
            }

            k++;
        }

        //There will be cases when one of the subArray (firstHalf or secondHalf) will have some elements left, then we will add those element in the mix.

        //If there are some elements left in the firstHalf
        while (i < firstHalf.length) {
            mix[k] = firstHalf[i];
            i++;
            k++;
        }

        //If there are some elements left in the secondHalf
        while (j < secondHalf.length) {
            mix[k] = secondHalf[j];
            j++;
            k++;
        }


        return mix; //At this point the mix is sorted.

    }
}
