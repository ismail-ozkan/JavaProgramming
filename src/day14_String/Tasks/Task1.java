package day14_String.Tasks;

import java.util.Scanner;

public class Task1 {
/*
1. Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
 */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter first word: ");
        String firstWord = scan.nextLine();

        System.out.println("Please enter second word: ");
        String secondWord = scan.nextLine();

        firstWord = firstWord.substring(1);
        secondWord = secondWord.substring(1);
        System.out.println(firstWord+secondWord);

        System.out.println("Please enter a two-word sentence: ");
        String sentence = scan.nextLine();

        String w1 = sentence.substring(1, sentence.indexOf(" "));
        String w2 = sentence.substring(sentence.indexOf(" ")+2);

        System.out.println(w1+w2);

        scan.close();

    }

}
