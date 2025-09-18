package Functions;

import java.util.Scanner;

public class max_min {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = in.nextInt();


        int max_ans = max(num1, num2, num3);
        int min_ans = min(num1, num2, num3);
        System.out.println(max_ans + " " +min_ans);
    }


    static int max(int a, int b, int c) {
        int max = a;
        if (max < b && c < b) {
            return b;
        } else if (max < c ) {
            return c;
        }
        return a;
    }
    static int min(int a, int b, int c) {
        int min = a;
        if (min > b && c > b) {
            return b;
        } else if (min > c) {
            return c;
        }
        return a;
    }
}
