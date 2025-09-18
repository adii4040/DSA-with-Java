package Functions.list_all;

import java.util.Scanner;

public class list_n_armstrong_numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        for (int i = 100; i <= num; i++) {
            if (isArm(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isArm(int n) {
        int original = n;
        int arm = 0;
        int count = count(n);
        while (n != 0) {
            int rem = n % 10;
            int pro = 1;
            for (int i = 1; i <= count; i++) {
                pro *= rem;
            }
            arm += pro;
            n /= 10;
        }

        return original == arm;
    }

    static int count(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }

        return count;
    }
}
