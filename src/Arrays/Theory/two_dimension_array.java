package Arrays.Theory;

import java.util.Arrays;
import java.util.Scanner;

public class two_dimension_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][3]; //This way  we define and initialize the 2-D array. int[row][col]

        //Take the input for the 2-D array
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        //Get the output of the 2-D array


//        for (int row = 0; row < arr.length; row++) {
//            // for each col in every row
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print("[ " + arr[row][col] + " " + "]");
//            System.out.println();
//        }


        //This is the better way to get the output of the 2-D array

        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
