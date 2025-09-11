package Conditional_And_loops;

import java.util.Scanner;

public class Check_Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int original  = num;
        int rev = 0;
        while (num != 0) {
            int rem = num % 10;
            rev = rem + rev * 10;
            num /= 10;
        }

        if (rev == original) {
            System.out.println(original + " is a palindrome number");
        } else {
            System.out.println(original + " is not a palindrome number");
        }
    }
}
