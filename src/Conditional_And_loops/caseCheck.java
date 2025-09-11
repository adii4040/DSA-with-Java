//Check if the given input character is uppercase or lowercase.

package Conditional_And_loops;

import java.util.Scanner;

public class caseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char ch = in.next().trim().charAt(0);
        //.trim()- it remove the whitespaces from ahead and back of the string,
        // to get the first element or the letter of  word, we use charAt(0), charAt() means chart at the given index of the sting.

        System.out.println(ch);

        if (ch >= 'a' && ch <= 'z') {
            //check if the following character comes in between a - z.
            System.out.println(ch + " is a lowercase character");
        } else {
            System.out.println(ch + " is an uppercase character");
        }
    }
}
