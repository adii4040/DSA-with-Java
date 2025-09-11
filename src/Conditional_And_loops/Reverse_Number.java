package Conditional_And_loops;

public class Reverse_Number {
    public static void main(String[] args) {
        int n = 43215614;
        int rev = 0;
        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        System.out.println(rev);
    }
}
