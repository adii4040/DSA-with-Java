package Conditional_And_loops;

public class Counting_Occurence {
    public static void main(String[] args) {
        int n = 1;
        int num = 8484659;

        int count = 0;

        while (num != 0) {
            int rem = num % 10;
            num = num / 10;
            if (rem == n) {
                count++;
            }
        }

        System.out.println(count);
    }
}
