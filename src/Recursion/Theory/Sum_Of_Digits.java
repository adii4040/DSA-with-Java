package Recursion.Theory;

public class Sum_Of_Digits {
    public static void main(String[] args) {
        System.out.println(sumDig(5464986));
    }

    static int sumDig(int n) {
        if (n / 10 == 0) {
            return n;
        }

        // int rem = n % 10;  No need to make a new variable

        return n % 10 + sumDig(n / 10);
    }
}
