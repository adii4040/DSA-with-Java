package Arrays.Questions.Easy;

import java.util.Arrays;

public class Target_Array_In_The_Given_Order {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        System.out.println(Arrays.toString(createTargetArray(arr, index)));
    }

    static int[] createTargetArray(int[] nums, int[] index) {
        int[] result = new int[index.length];

        for (int i = 0; i <= index.length-1; i++) {
            if (result[index[i]] == 0) {
                result[index[i]] = nums[i];
            } else {
                int temp = result[index[i]];
                int temp2 = result[index[i] + 1];
                result[index[i]] = nums[i];
                result[index[i] + 1] = temp;
                result[index[i] + 2] = temp2;

            }
        }

        return result;
    }
}
