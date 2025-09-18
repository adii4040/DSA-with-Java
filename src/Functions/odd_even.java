package Functions;

import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number");
        int num = in.nextInt();

        if(checkOddEven(num)){
            System.out.println(num + " is an even number");
        } else {
            System.out.println(num + " is an odd number");
        }
    }

    static boolean checkOddEven(int n) {
        return n % 2 == 0;
    }
}
