package Arrays.Questions.Easy;

import java.util.Arrays;

public class Flip_Image {
    public static void main(String[] args) {
        int[][] image = {{1,1,0,0}, {1,0,0,1}, {0,1,1,1}, {1,0,1,0}};
        for (int i = 0; i < image.length; i++) {
            System.out.println(Arrays.toString(image[i]));
        }
        reverse2dArr(image);
        System.out.println(" ");
        for (int i = 0; i < image.length; i++) {
            System.out.println(Arrays.toString(image[i]));
        }
        int[][] newA = flipAndInvertImage(image);
        System.out.println(" ");
        for (int i = 0; i < image.length; i++) {
            System.out.println(Arrays.toString(newA[i]));
        }
    }

    static void reverse2dArr(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            int start = 0;
            int end = image[i].length - 1;
            while (start < end) {
                int temp = image[i][start];
                image[i][start] = image[i][end];
                image[i][end] = temp;
                start++;
                end--;
            }
        }
    }

    static int[][] flipAndInvertImage(int[][] image) {
        int[][] flippedImg = new int[image.length][image[0].length];

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                if (image[i][j] == 1) {
                    flippedImg[i][j] = 0;
                } else {
                    flippedImg[i][j] = 1;
                }
            }
        }

        return flippedImg;
    }
}
