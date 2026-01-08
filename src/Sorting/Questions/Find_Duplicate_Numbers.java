package Sorting.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_Duplicate_Numbers {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2};
        System.out.println(advFindDuplicate(arr));
    }

    //Since THERE IS ONLY ONE DUPLICATE NUMBER, we can simply sort the array and the duplicate element will come at the end because it is extra and elements will be sorted till N - 1.


    //In this case if there is no duplicate element, then also it will return an element which is at the last index, so for those cases this is not a right approach other than that, its good approach.
    static int findDuplicate(int[] nums) {
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
        return nums[nums.length - 1];
    }


    //To tackle the problem of an array without any duplicate elements.

    static int advFindDuplicate(int[] nums) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            int correctIndex = nums[i] - 1;

            //Check if the element at the current index is right or not, means it there where it should be or not

            if (nums[i] != i + 1) {  //Element at the current index is one more than the index, so if it is not there then swap


                //Now check if the element at the current index is at its correct index or not, we are double-checking this because there are duplicate elements too so there can be the same element at the correct index and the element which is at the current index  is the duplicate one.
                if (nums[i] != nums[correctIndex]) {
                    //If it is not same then just swap
                    swap(nums, i, correctIndex);
                } else {
                    return nums[i];
                }
            } else {  // If the element is at correct index then increment the i
                i++;
            }

        }
        return -1;
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}


