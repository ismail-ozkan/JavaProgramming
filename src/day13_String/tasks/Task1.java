package day13_String.tasks;

import java.util.Scanner;

/*
1. write a program that asks user to enter a sentence.
                then print the first & last characters of the sentence
 */
public class Task1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence");

        String sentence = scan.nextLine();


        char chFirst = sentence.charAt(0);
        char chLast = sentence.charAt(sentence.length()-1);

        System.out.println(chFirst+" and "+chLast);

        scan.close();

    }

}
