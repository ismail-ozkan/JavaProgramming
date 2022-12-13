package day13_String;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter First Name:");
        String firstName = input.next();
        System.out.println("Enter Last Name:");
        String lastName = input.next();

        char f = firstName.charAt(0);
        char l = lastName.charAt(0);
        //String initial = f + l; // this is a concatenation and give us compile error.
                                // there must be String on left or right side of + operator for do concatenation
        String initial = ""+f + l;

        System.out.println("initial = " + initial);

        System.out.println(f+"."+l);// it is also concatenation


        input.close();
    }

}
