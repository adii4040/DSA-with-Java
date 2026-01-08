package Recursion.Theory;

public class Recursive_fibo {
    public static void main(String[] args) {
        System.out.println(fibo(1));
    }

    static int fibo(int n) {

        //Base condition
        if (n < 2) {
            return n;
        }

        return fibo(n - 1) + fibo(n - 2);
    }
}
