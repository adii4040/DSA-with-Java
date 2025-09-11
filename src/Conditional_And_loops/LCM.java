package Conditional_And_loops;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();

        int num2 = in.nextInt();

        int mul1 = 0;
        int mul2 = 0;
        int LCM = 0;
        for (int i = 2; i <= 10; i++) {
            mul1 = num1 * i;
            for (int j = 2; j <= 10; j++) {
                mul2 = num2 * j;
                if (mul1 == mul2) {
                    System.out.println(mul1);
                    System.out.println(mul2);
                    LCM = mul1;
                    break;
                }

            }
        }
        System.out.println(LCM);
    }

}
