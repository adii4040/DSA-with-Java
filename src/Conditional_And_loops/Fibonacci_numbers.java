package Conditional_And_loops;

import java.util.Scanner;

public class Fibonacci_numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner((System.in));

        System.out.print("Enter the number: ");
        int n = in.nextInt();

        int a = 0;
        int b = 1;
        for (int i = 1; i < n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        if (n == 0) {
            b = a;
        }
        System.out.println(b);
    }
}
