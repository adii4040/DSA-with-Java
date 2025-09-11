package Conditional_And_loops;

public class Subtract_the_product_and_sum_of_digits {
    public static void main(String[] args) {
        int n = 456;
        int sub = 0;
        int pro = 1;
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            pro *= rem;
            sum += rem;
            n = n / 10;
        }
        sub = pro - sum;
        System.out.println(sub);
    }
}
