package Functions.list_all;

import java.util.Scanner;

public class list_n_prime_numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        for (int i = 1; i <= num; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isPrime(int n) {
        int count = 2;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        return count <= 2;
    }
}
