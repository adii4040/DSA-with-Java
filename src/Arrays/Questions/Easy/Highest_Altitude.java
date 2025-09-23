package Arrays.Questions.Easy;

import java.util.Arrays;

public class Highest_Altitude {
    public static void main(String[] args) {
        int[] arr = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(arr));
    }

    static int largestAltitude(int[] gain) {
        int[] alt = new int[gain.length + 1];
        alt[0] = 0;
        for (int i = 1; i < alt.length; i++) {
            alt[i] = alt[i - 1] + gain[i - 1];
        }
        return findMax(alt);

    }

    static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
