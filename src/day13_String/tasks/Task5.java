package day13_String.tasks;

import java.util.Scanner;

/*
5. Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself

 */
public class Task5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word:");
        String word = scan.nextLine();

        if (word.length()==0) {
            System.out.println("String is empty");
        } else if (word.length()>3) {
            System.out.println(""+ word.charAt(word.length()-3)+ + word.charAt(word.length()-2) + word.charAt(word.length()-1));
        } else {
            System.out.println(word);
        }

        scan.close();

    }

}
