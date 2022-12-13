package day15_ForLoop;

import java.util.Scanner;

/*
1. Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */
public class WarmupTask1 {

    public static void main(String[] args) {

        String word = new Scanner(System.in).nextLine();

        if (word.charAt(0) == 'x') {// we can use == operotor for char variable but not STRİNG *** DON'T FORGET !!!
            word = word.replaceFirst("x", "a");
        }
        //we can use 'ch' in repalce() method but NOT in replaceFirst() method

        // we don't need  to close Scanner class in here !!!*****
    }

}
