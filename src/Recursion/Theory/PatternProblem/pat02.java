package Recursion.Theory.PatternProblem;

public class pat02 {
    public static void main(String[] args) {
        //triangle(4);
        //rectrianle(4, 0, 0);
        rectrianleOpt(4,0);
    }

    static void triangle(int n) {
        for (int r = 0; r < n; r++) {
            for (int c = 0; c <= r; c++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }


    //Here we took the extra space.
    static void rectrianle(int n, int r, int c) {
        if (r == n) {
            return;
        }
        if (c <= r) {
            System.out.print("* ");
            rectrianle(n, r, c + 1);
        } else {
            System.out.println(" ");
            rectrianle(n, r + 1, 0);
        }
    }

    //Without taking the extra space
    static void rectrianleOpt(int r, int c) {
        if (r == 0) {
            return;
        }
        if (r != c) {
            rectrianleOpt(r, c + 1);
            System.out.print("* ");
        } else {
            rectrianleOpt(r - 1, 0);
            System.out.println(" ");
        }

        //The print statement will be called after the function is popped out of the stack.
    }

}
