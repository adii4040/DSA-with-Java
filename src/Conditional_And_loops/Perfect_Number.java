package Conditional_And_loops;

import java.util.Scanner;

public class Perfect_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if (num > 0) {
            int sum = 0;
            for (int i = 1; i <= num/2; i++) {
                if (num % i == 0) {
                    sum += i;

                }
            }
            if (sum == num) {
                System.out.println(num + " is a perfect number");
            } else {
                System.out.println(num + " is not a perfect number");
            }
        } else {
            System.out.println(num + " is a negative number");
        }
    }
}
