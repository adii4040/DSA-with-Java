package Arrays.Questions.Easy;

import java.util.Arrays;

public class Build_array_from_permutation {
    public static void main(String[] args) {
        int[] nums = {5,0,1,2,3,4};
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(buildArray(nums)));
    }

    static int[] buildArray(int[] arr) {
        if(arr.length == 0) {
            return null;
        }
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[arr[i]];
        }
        return ans;
    }
}
