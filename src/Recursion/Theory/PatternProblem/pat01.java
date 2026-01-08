package Recursion.Theory.PatternProblem;

public class pat01 {
    public static void main(String[] args) {
        //triangle(4);
        //rectrianle(4);
        rectrianleOpt(4, 0);
    }

    static void triangle(int n) {
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n - r; c++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    //Check here, this is a recursive way of pattern printing, but here we are still using the loop which will increase the time complexity
    static void rectrianle(int n) {
        if (n == 0) {
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }

        System.out.println(" ");
        rectrianle(n - 1);
    }

    //Another way, proper and optimized way.
    static void rectrianleOpt(int r, int c) {
        if (r == 0) {
            return;
        }
        if (r != c) {
            System.out.print("* ");
            rectrianleOpt(r, c + 1);
        } else {
            System.out.println(" ");
            rectrianleOpt(r - 1, 0);
        }
    }





}
