package BinarySearch.Theory.TwoD_Array;


//The following matrix is sorted both row and collum wise.

import java.util.Arrays;

public class Search_In_Sorted_Matrix {
    public static void main(String[] args) {
        int[][] arr = {
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {33,34,38,50}
        };

        int target = 50;
        System.out.println(Arrays.toString(binarySearch(arr, target)));
    }

    static int[] binarySearch(int[][] arr, int target) {
        //We will start searching from the last column of the first row and go till the last row and 0th column, means we will search backward.

        int row = 0; //start
        int col = arr.length - 1; //end

        //Search in the first row from the last column.
        //until we are at the last row and the first column.
        while (row < arr.length && col >= 0) {


            //If the current element is the targeted element, just return the element.
            if (target == arr[row][col]) {
                return new int[]{row, col};
            }

            //If the current element which is at the last column of the first row, is greater than the target element, just ignore that col because all the other elements in that column will be greater than the target element
            if (target < arr[row][col]) {
                col--;
            }

            //If the current element which is at the last column of the first row, is smaller than the target element, just ignore that row because all the other elements in that row will be smaller than the target element
            else{
                row++;
            }


        }

        return new int[]{-1, -1};
    }
}

