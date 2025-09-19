package Arrays.Theory;

import java.util.Arrays;
import java.util.Scanner;

public class basics {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //Declaration of array - arr are getting defined in the stack
        int[] arr;

        //Initialization of array
        arr = new int[5]; //actual memory allocation happens here. Here, object is being created in heap memory.

        //new int[] - creating object in heap memory.
        //This concept is known as " DYNAMIC MEMORY ALLOCATION " which means at runtime OR execution time memory is allocated.


        arr[0] = 14;
        arr[1] = 561;
        arr[2] = 165;
        arr[3] = 16;
        arr[4] = 51;
        //System.out.println(Arrays.toString(arr));  //Internally Arrays.toString( ) uses for loop and gives the o/p in the proper format.

        int[] arr2 = {24, 54, 65, 46, 36};
        //System.out.println(Arrays.toString(arr2));

        String[] nameChar = new String[6];

        for (int i = 0; i < nameChar.length; i++) {
            nameChar[i] = in.next();
        }
        System.out.println(Arrays.toString(nameChar));

        //Modify the element since arrays are mutable.
        nameChar[1] = "Singh";
        System.out.println(Arrays.toString(nameChar));
    }
}
