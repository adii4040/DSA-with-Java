package Arrays.Questions.Easy;

import java.util.Arrays;

public class Max_in_range {
    public static void main(String[] args) {
        int[] arr = {155, 66, 88, 33, 94};
        System.out.println(Arrays.toString(arr));
        System.out.println(findMaxInRange(arr, 0, 3));
    }

    static int findMaxInRange(int[] arr, int firstIndex, int secondIndex) {
        int max = arr[firstIndex];
        for (int i = firstIndex + 1; i <= secondIndex; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }


}
