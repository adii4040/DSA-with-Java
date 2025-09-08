//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
package First_Java_Program.assignment;

import java.util.Scanner;

public class program02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.println("Now select the operators - ( 1. *, 2. /, 3. %, 4. +, 5. - )");
        int op = input.nextInt();

        if (op == 1) {
            System.out.println("Product is " + num1 * num2);
        } else if (op == 2) {
            System.out.println("Division is " + num1 / num2);
        } else if (op == 3) {
            System.out.println("Remainder is " + num1 % num2);
        } else if (op == 4) {
            System.out.println("Sum is " + (num1 + num2));
        } else if (op == 5) {
            System.out.println("Difference is " + (num1 - num2));
        } else {
            System.out.println("Wrong input operator, choose from 1-5");
        }
    }
}
