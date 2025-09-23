package Arrays.Questions.Easy;

import java.util.Arrays;

public class Transpose_Matrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println(" ");

        int[][] newA = transpose(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(newA[i]));
        }
    }

    static int[][] transpose(int[][] matrix) {
        int[][] result = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int temp = matrix[i][j];
                result[i][j] = matrix[j][i];
                result[j][i] = temp;
            }
        }

        return result;
    }
}
