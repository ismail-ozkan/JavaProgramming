package day14_String.Tasks;

import java.util.Scanner;

/*

    5. Ask user to enter a word,
        if the word starts with digits, print "first character is digit"
        if the word starts with uppercase letters, print "first character is lowercase letter"
        if the word starts with lowercase letters, print "first character is uppercase letter"
        if the word starts with special characters, print "first character is special character"

        HINT: 1. you need charAt() method
              2. Ascii Table
 */
public class Task5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please Enter a word: ");
        String word = scan.next();

        String result = "";

        char firstCh = word.charAt(0);

        System.out.println("firstCh = " + firstCh);
        if (firstCh>='0' && firstCh<='9') {
            result = "first character is digit";
        } else if (firstCh>='a'&& firstCh<='z') {
            result = "first character is lowercase letter";
        } else if (firstCh>='A'&&firstCh<='Z') {
            result = "first character is uppercase letter";
        } else {
            result = "first character is special character";
        }

        System.out.println(result);

    }

}
