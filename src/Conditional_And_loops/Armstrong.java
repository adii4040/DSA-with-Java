package Conditional_And_loops;

public class Armstrong {
    public static void main(String[] args) {
        //First find the number of digits in the number, as that many times we have to multiply each digit.
        int n = 475;
        int original = n;
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        //System.out.println(count);

        int sum = 0;
        int n2 = original;
        while (original != 0) {
            int rem = original % 10;
            int pro = 1;
            for (int i = 1; i <= count; i++) {
                pro *= rem;
            }
            sum += pro;
            original /= 10;
        }

        if (sum == n2) {
            System.out.println(n2 + " is an armstrong number");
        } else {
            System.out.println(n2 + " is not an armstrong number");
        }


    }
}
