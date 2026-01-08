package Recursion.Theory;

public class Product_Of_Digits {
    public static void main(String[] args) {
        System.out.println(proDig(25));
    }

    static int proDig(int n) {
//        if (n == 0) {
//            return 1;
//        }


        // if the rem of a number is itself, this means it is a one-digit number, and previously for the one digit num we were checking if  n / 10 = 0 just return 1;
        // But now we will make one less call by checking if we are at the last digit ( n%10 == n ), just return the n

        if (n % 10 == n) { // or do ( n/10 == 0 )  // Here we are checking or calling the function one less time than the previous one, thus it will take lesser thime
            return n;
        }

        return n % 10 * proDig(n / 10);
    }
}
