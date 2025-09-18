package Functions;

import java.util.Scanner;

public class nth_fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();
        System.out.println(fibo(num));
    }

    static int fibo(int n) {
        int a = 0;
        int b = 1;
        int fibo = 1;
        for (int i = 2; i <= n; i++) {
            fibo = a + b;
            a = b;
            b = fibo;
        }
        if (n == 0) return 0;
        return fibo;
    }
}
