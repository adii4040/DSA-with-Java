package Arrays.Questions.Easy;

import java.util.Arrays;

public class Concatenation_of_array {
    public static void main(String[] args) {
        //arr = [1,2,1] length -> n
        //ans = [1,2,1,1,2,1] length -> 2n
        //0 <= i < n


        int[] arr = {1,3,2,1};
        System.out.println(Arrays.toString(concat(arr)));
    }

    static int[] concat(int[] nums) {
        if(nums.length == 0) {
            return null;
        }
        int[] ans = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = ans[i];
        }

        return ans;
    }
}
