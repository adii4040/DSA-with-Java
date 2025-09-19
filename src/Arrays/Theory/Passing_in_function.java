package Arrays.Theory;

import java.util.Arrays;

public class Passing_in_function {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
        int a = 10;
        newInt(a);
        //System.out.println(a);
    }

    //Since both arr and array is point to same array object, changes in the array will reflect in the arr too because arrays are immutable.

    //Objects (arrays, Strings, custom classes, etc.) → passed by value of the reference (a copy of the reference, but both references point to the same heap object).
    static void change(int[] array) {
        array[0] = 14;
    }


    //In Java, primitives are immutable inside functions because they’re passed by value.
    static void newInt(int b) {
        System.out.println(b);
        b = 88;
        System.out.println(b);
    }
}
