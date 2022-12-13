package day16_ForLoopStringPractice.Tasks;

import java.util.Scanner;

public class Task4_FrequencyOfWord {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scan.nextLine();
        String word = "Java";
        int frequency = 0;
        int frequency1 = 0;

        for (int i = 0; i < str.length()-3; i++) {
            if (str.substring(i,i+4).equals(word)) {
                frequency++;
            }
        }
        System.out.println(frequency);

        for (int i = 0; i < str.length()-3; i++) {
            if (str.substring(i,i+4).startsWith(word)) {
                frequency1++;
            }
        }
        System.out.println(frequency1);


    }

}
/*
4. write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2

            Hint: you need to create
 */