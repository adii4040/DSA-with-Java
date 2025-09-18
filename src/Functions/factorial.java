package Functions;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        if(n<0) {
            System.out.println(n + " is a negative number.");
        } else {
            System.out.println(fact(n));
        }
    }


    static int fact(int n) {

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }
}
