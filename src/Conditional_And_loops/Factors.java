package Conditional_And_loops;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        for (int i = 1; i <= (num / 2); i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
        System.out.println(num);
    }
}
