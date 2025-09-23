package Arrays.Questions.Easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Shuffle_the_array {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 4, 7};
        System.out.println(Arrays.toString(shuffle(arr)));
    }

    static int[] shuffle(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i = i + 2) {
                ans[i] = nums[i];
                ans[i + 1] = nums[n / 2 + i];


        }
        return ans;
    }
}
