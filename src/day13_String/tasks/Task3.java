package day13_String.tasks;

import java.util.Scanner;

/*
3. write a program that can check if the first and last characters of the string are same
            ex:
               level
            output:
                same
 */
public class Task3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word: ");

        String word = scan.next();

        if (word.charAt(0) == word.charAt(word.length()-1)) {
            System.out.println("same");
        } else {
            System.out.println("not same");
        }

        scan.close();

    }

}
