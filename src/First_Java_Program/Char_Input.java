package First_Java_Program;

import java.util.Scanner;

public class Char_Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //To get the input in char, use .next() just like string, it takes the first word only not the entire line.
        // store it in char data type and trim the rest of part and just take the first letter or any expression
        //Why only the first letter? Because a character is a single digit or letter data.

        char ch = in.next().trim().charAt(0);

        //Why we didn't use the String since we are dealing with string type of data?
        //Since a character is a single digit or letter data, we need charAt(), and this is the method of char not String, thus we do not use String to take a character or expression input.

        //EG: String ch = in.next().trim().charAt(0);
        System.out.println(ch);

    }
}
