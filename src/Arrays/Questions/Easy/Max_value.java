package Arrays.Questions.Easy;

import java.util.Arrays;

public class Max_value {
    public static void main(String[] args) {
        int[] arr = {155, 66, 88, 33, 94};
        System.out.println(Arrays.toString(arr));
        System.out.println(findMax(arr));
    }

    static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
             max = arr[i];
            }
        }
        return max;
    }
}
