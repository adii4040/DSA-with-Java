package Sorting.Questions;

import java.util.Arrays;

public class Set_Mismatch {
    public static void main(String[] args) {
        int[] arr = {2, 1, 2, 4};
        System.out.println(Arrays.toString(setMismatch(arr)));
    }


    static int[] setMismatch(int[] nums) {
        int i = 0;
        int n = nums.length;

        while (i < n) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        //TIPS: When there is question saying find all ---, just do cyclic sort first and then loop over the sorted array and find whatever the ques has asked.

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return new int[]{nums[j], j + 1};
            }
        }

        return new int[]{-1, -1};
    }


    //To tackle the problem of an array without any duplicate elements.


    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
