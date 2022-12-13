package day14_String.Tasks;

import java.util.Scanner;

public class Task7calledEmailTask1 {
/*
7. Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email (Seperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com
 */
    public static void main(String[] args) {

        System.out.println("Enter your email address: ");
        String email = new Scanner(System.in).nextLine();
        String firstName = email.substring(0,email.indexOf("_"));
        String lastName = email.substring(email.indexOf("_")+1,email.indexOf("@"));
        String domain = email.substring(email.indexOf("@"));
        if (email.contains("_")) {
            email = lastName+"_"+firstName+domain;
        }

        System.out.println(email);

    }

}
