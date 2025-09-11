package Conditional_And_loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int pro = 1;

        for (int i = 1; i <= (num - 1); i++) {
            pro *= i;
        }
        int fact = pro*num;
        System.out.println(num+"!" + " = " + fact);
    }
}
