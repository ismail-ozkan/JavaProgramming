package day13_String.tasks;

import java.util.Scanner;

/*
6. write a program that asks the user enter a three letter word. Check if the middle character of the given word is 'a'. In the case it is print: "Cool word", but in the case the middle letter is not 'a' print: "Okay word".
     - If the user does not enter a 3 letter word tell them:
             If the word is less than 3 letters: "Word is too short"
             If the word is too long: "Word is too long"
 */
public class Task6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter three letter word: ");

        String word = scan.next();

        int wordLength = word.length();
        String result = "";



        switch (wordLength) {
            case 3:
                if (word.charAt(1) == 'a') {
                    result = "Cool word";
                } else {
                    result = "Okay word";
                }
                break;
            default:
                if (wordLength<3){
                    System.out.println("Word is too short");
                } else {
                    System.out.println("Word is too long");
                }
        }

        System.out.println(result);

        scan.close();

    }

}
