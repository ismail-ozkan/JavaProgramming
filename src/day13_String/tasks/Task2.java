package day13_String.tasks;

import java.util.Scanner;

/*
2. write a program that asks user to enter two strings, and print out the longest string


 */
public class Task2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two Stirng");
        String first = scan.nextLine();
        String second = scan.nextLine();

        String longestString = (first.length()>second.length())? first:(second.length()>first.length())? second:"Noting";

        System.out.println(longestString);

        scan.close();

    }

}
