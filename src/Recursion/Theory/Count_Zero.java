package Recursion.Theory;

public class Count_Zero {
    public static void main(String[] args) {
        System.out.println(countCheck(0, 0));
    }

    static int countCheck(int n, int count) {
        // We are taking count as arg not as a local variable because in recursion, each function call creates a new copy of local variables, therefore it will always be new for each function call, and it won't be returned to next or previous function call,
        // But taking count as arguments will ensure value of count is passed to the next function call and its value will be returned too.
        if (n == 0) {
            return count; // At the end return count, this will show how a value is passed from the  last function call to the previous function calls while getting removed from the stack.
        }
        if (n % 10 == 0) {
            return countCheck(n / 10, count + 1);
        }
        return countCheck(n / 10, count);

    }
}
