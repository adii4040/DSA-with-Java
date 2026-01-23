package Arrays.Questions.Easy;

import java.util.Arrays;
import java.util.HashMap;

public class Two_sum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(arr, 18)));
    }

    //LOGIC:

    //We can not just sort the array and find it because if we sort the array explicitly, it will change it index value.
    //We can not use two-pointer method here, because we don't know where do we need to check the numbers if we get one of the operand, it could anywhere, before  it or after it.
    //So first we loop through each element and take its corresponding operand for the sum of target and add that operand in the hashmap, and later will check if it exists, then we will just return it.

    static int[] twoSum(int[] nums, int target) {
        //This is used when the array is not sorted

        //We will use hashmap to store the value and its index
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int index = 0; index < nums.length; index++) {
            //Get the required operand
            int reqOperand = target - nums[index];

            //Check if the required operand is in the map. If it exists means we got the two required sum operands
            if (map.containsKey(reqOperand)) {
                return new int[]{map.get(reqOperand), index};
            }

            //If the required operand is not in the map, just add the current element in the map for the future element's to check.
            map.put(nums[index], index);

        }

        return new int[]{-1, -1};


    }
}
