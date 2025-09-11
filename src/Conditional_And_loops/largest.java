//Find the largest of the following number using loops.

package Conditional_And_loops;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = in.nextInt();

        int max = num1;

        if (max < num2 ) {
            max = num2;
        } else if (max < num3) {
            max = num3;
        }
        System.out.println("Max is " + max);
    }
}
