package Arrays.Questions.Easy;

import java.util.Arrays;

public class Richest_customer_wealth {
    public static void main(String[] args) {
        int[][] arr = {{1, 5, 7}, {3, 2, 1, 13}, {7,1,3}, {1,9,15}};
        System.out.println(Arrays.toString(maxWealth(arr)));
    }

    static int[] maxWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        int indexNum = 0;
        ;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (max < sum) {
                max = sum;
                indexNum = i;
            }
        }
        int[] ans = {max, indexNum};
        return ans;
    }
}
