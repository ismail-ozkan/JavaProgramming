package day13_String.tasks;

import java.util.Scanner;

/*
4. write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S

        Note: Pay attention to the example output
 */
public class Task4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = scan.nextLine();

        System.out.println("Enter surname:");
        String surname = scan.nextLine();

        String initials = name.charAt(0)+"."+surname.charAt(0);


        System.out.println(initials);


        scan.close();

    }

}
