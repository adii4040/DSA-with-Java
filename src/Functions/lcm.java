package Functions;

import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = in.nextInt();

        System.out.print("Enter second number: ");
        int num2 = in.nextInt();

        System.out.println(lcm(num1, num2));
    }

    static int lcm(int n1, int n2) {
        int mul = Math.max(n1, n2);
        int lcm = 0;
        while (lcm == 0) {
            if (mul % n1 == 0 && mul % n2 == 0) {
                lcm = mul;
            }
            mul++;
        }

        return lcm;
    }
}
