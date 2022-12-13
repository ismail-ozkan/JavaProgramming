package day15_ForLoop;

import java.util.Scanner;
/*
Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
 */
public class WarmupTasks2 {

    public static void main(String[] args) {

        System.out.println("Please Enter a word: ");
        String word = new Scanner(System.in).nextLine();//if only one input is given from user, it can be used

        word = word.replace("x", "a").replace("X", "a");

        System.out.println(word);

    }

}
