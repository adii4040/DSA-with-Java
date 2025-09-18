package Functions.list_all;

import java.util.Scanner;

public class list_n_palindrome_numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        for (int i = 1; i <= num; i++) {
            if (isPal(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isPal(int n) {
        int original = n;
        int rev = 0;
        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }

        return original == rev;
    }
}
