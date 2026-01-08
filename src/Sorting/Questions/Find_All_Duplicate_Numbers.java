package Sorting.Questions;

import java.util.ArrayList;
import java.util.List;

public class Find_All_Duplicate_Numbers {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1, 4};
        System.out.println(findDuplicate(arr));
    }


    static List<Integer> findDuplicate(int[] nums) {
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
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                ans.add(nums[j]);
            }
        }

        return ans;
    }


    //To tackle the problem of an array without any duplicate elements.


    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
