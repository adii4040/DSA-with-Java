package Recursion.Theory;

public class printN {
    public static void main(String[] args) {
//        printNTo1(5);
//        System.out.print("");
        print1ToN(5);
    }

    static void printNTo1(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);

        printNTo1(n - 1);
    }

    static void print1ToN(int n) {
        if (n == 0) {
            return;
        }

        print1ToN(n - 1);

        //Recursion goes only till the line where it is called,
        //and when that recursive call returns,
        //the program continues execution from the next line below the recursive call in the previous function.

        System.out.println(n);
    }

}
