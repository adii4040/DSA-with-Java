package Arrays.Questions.Easy;

import java.util.Arrays;

public class Running_sum {
    public static void main(String[] args) {

        //arr = [1,2,3,4]
        //ans = [1,3,6,10]
        int[] arr = {3,1,2,10,1};
        System.out.println(Arrays.toString(runningSum(arr)));
    }

    static int[] runningSum(int[] nums) {
        if (nums.length == 0) {
            return null;
        }

        int[] ans = new int[nums.length];
        ans[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            ans[i] = ans[i - 1] + nums[i];
        }

        return ans;
    }
}
