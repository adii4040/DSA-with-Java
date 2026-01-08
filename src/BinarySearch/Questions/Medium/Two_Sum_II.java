package BinarySearch.Questions.Medium;

import java.util.Arrays;

public class Two_Sum_II {
    public static void main(String[] args) {
        int[] num = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(num, target)));
    }


    // We will use the two pointer approach here.
    static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            //Take the sum of start and end
            int sum = numbers[start] + numbers[end];

            //Condition: If the sum != target, one of these two or both of them are not the correct operands so we need new operands, so either we can go ahead by one place or go back by one place.

            //Case1: If sum < target, the sum is smaller than the target which means we need to increment a number in order to take the same near or = to the target because if we increase an operand then sum will increase automatically, thus we need to increment start
            if (sum < target) {
                start++;
            } else if (sum > target) {
                //Case2: If sum > target, the sum is greater than the target which means we need to decrement a number in order to take the same near or = to the target because if we decrease an operand then sum will decrease automatically, thus we need to decrement start
                end--;
            } else {
                return new int[]{start + 1, end + 1};
            }
        }
        return new int[]{-1, -1};
    }
}
