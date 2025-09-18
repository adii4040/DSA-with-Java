package Functions;

import java.util.Scanner;

public class basic {
    public static void main(String[] args) {

        /*
        This is the syntax of function in java.
        return_Type name( argument ) {
        //body
        return ...
        }
         */

        Scanner in = new Scanner(System.in);
        String name = in.next();
//
//        greet(name);
//
//        String secondName = in.next();
//        String greetback = greetBack(secondName);
//        System.out.println(greetback);
//
//        System.out.print("Enter num1: ");
//        int num1 = in.nextInt();
//        System.out.print("Enter num2: ");
//        int num2 = in.nextInt();
//
//        int ans = sum(num1, num2);
//        System.out.println(ans);


        int umar = in.nextInt();
        if (canVote(umar)) {
            System.out.println(name + " can vote");
        } else {
            System.out.println(name + " can't vote");
        }

    }

    //This is a simple function.
    static void greet(String name) {
        System.out.println("Hello " + name + ", how are you??");
    }


    //Function that returns something ---> Integer value
    static int sum(int a, int b) {
        return a + b;
    }


    //Function returning a String value
    static String greetBack(String name) {
        return "I am fine " + name + " , wby?";
    }

    //Function returning boolean value
    static boolean canVote(int age) {
        return age >= 18;
    }
}
