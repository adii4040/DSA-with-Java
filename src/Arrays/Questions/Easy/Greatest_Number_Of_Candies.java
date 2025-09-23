package Arrays.Questions.Easy;


//There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
//
//Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

import java.util.Arrays;

public class Greatest_Number_Of_Candies {
    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;
        System.out.println(Arrays.toString(kidsWithCandies(candies, extraCandies)));
    }

    static boolean[] kidsWithCandies(int[] candies, int extraCandies) {
        boolean[] result = new boolean[candies.length];
        for (int i = 0; i < candies.length; i++) {
            int newCandies = candies[i] + extraCandies;
            if (findMax(candies) <= newCandies) {
                result[i] = true;
            } else {
                result[i] = false;
            }
        }

        return result;
    }

    static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
