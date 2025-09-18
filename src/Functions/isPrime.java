package Functions;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
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
