package Recursion.Theory;

public class Reverse_Number {
    public static void main(String[] args) {
        rev1(964);
        System.out.println(sum);
        // System.out.println(964%10);
        System.out.println(rev2(905));
    }

    static int sum = 0;

    static void rev1(int n) {
        if (n == 0) {
            return;
        }
        sum = sum * 10 + n % 10;
        rev1(n / 10);
    }


    //Another way is by taking a helper function

    static int rev2(int n) {
        int digits = (int) (Math.log10(n) + 1);
        return helper(n, digits);
    }

    static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }

        int rem = n % 10;

        // return rem * (int) (Math.pow(10, digits - 1)) + rev(n/10);          version1
        return rem * (int) (Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);  //version2

        //The first version restarts recursion through the main function on each call, recalculating the number of digits repeatedly. Though logically correct, it consumes more computation. The second version continues within the same recursive chain by manually reducing the digit count, making it cleaner and more efficient.
    }
}
