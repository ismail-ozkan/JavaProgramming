package day14_String.Tasks;

import java.util.Scanner;

/*
 2. ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
 */
public class Task2 {//0123456

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please Enter a word: ");
        String word = scan.next();

        int wordLength = word.length();

        String lastTwoLetters = word.substring(wordLength-2).toLowerCase();

        if (lastTwoLetters.equals("ly")) {
            System.out.println("really???");
        } else {
            System.out.println("never mind");
        }

        scan.close();
    }
}
