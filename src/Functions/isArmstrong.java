package Functions;

import java.util.Scanner;

public class isArmstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();


        if (isArm(num)) {
            System.out.println(num + " is an armstrong number");
        } else {
            System.out.println(num + " is not an armstrong number");
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
