package Recursion.Questions;


//Number of steps to reduce a number to zero.

public class Leetcode_1342 {
    public static void main(String[] args) {
        int num = 20;
        System.out.println(countTillZero(num, 0));
    }

    static int countTillZero(int n, int c) {
        if (n == 0) {
            return c;
        }

        if (n % 2 == 0) {
            return countTillZero(n/2, c+1);
        }
        return countTillZero(n-1, c+1);
    }
}
