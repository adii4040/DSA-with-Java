package First_Java_Program;

import java.util.Scanner;

public class String_Input {
    public static void main(String[] args) {
        Scanner input = new Scanner((System.in));

        //STRING INPUT
        System.out.print("What is your fav color?");
        String color = input.next();
        System.out.println("So, " + color + " is your fav color.");
    }
}
