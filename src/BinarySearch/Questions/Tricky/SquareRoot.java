package BinarySearch.Questions.Tricky;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(mySqrt(50));
    }

    static int mySqrt(int x) {
        if (x < 2) return x;

        int start = 1;
        int end = x / 2;   //for x >= 2, the sqrt of a number is less than its half, so no need to check from 1 to x.

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long sqrt = (long) mid * mid; //mid*mid can overflow the range of int so just cast to long. --> This will avoid INTEGER OVERFLOW.

            if (sqrt < x) {
                start = mid + 1;
            } else if (sqrt > x) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return end;
    }

    static boolean isPerfectSquare(int num) {
        int sqrt = mySqrt(num);
        return sqrt * sqrt == num;
    }
}
