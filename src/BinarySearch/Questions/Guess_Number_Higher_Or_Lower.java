package BinarySearch.Questions;

public class Guess_Number_Higher_Or_Lower {
    public static void main(String[] args) {
        System.out.println(guessNumber(3));
    }


    //Pick number from 1 to n,
    static int guessNumber(int n) {
        int start = 1;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int guess = guess(mid);
            if (guess < 0) {
                end = mid - 1;
            } else if (guess > 0 ) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return n;
    }

    static int guess(int n) {
        int pick = 1;
        if (n > pick) {
            return -1;
        } else if (n < pick) {
            return 1;
        } else {
            return 0;
        }
    }

}
