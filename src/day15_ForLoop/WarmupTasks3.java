package day15_ForLoop;

import java.util.Locale;
import java.util.Scanner;

/*
Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";
                    output:
                        Cydeo School
 */
public class WarmupTasks3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter first name: ");
        String firstName = scan.nextLine();

        System.out.println("Please enter last name: ");
        String lastName = scan.nextLine();


        // Don't forget charAt() method return you a char variable and you don't use with it substring method.
        firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
        // other way with using charAt() method
        String firstName2 = (""+firstName.charAt(0)).toUpperCase() +firstName.substring(1);
                     // here yet a string data type= "A" for example


        System.out.println(firstName+" "+lastName);
        System.out.println(firstName2+" "+lastName);


    }

}
