package day13_String.tasks;

import java.util.Scanner;

/*
7. Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"
 */
public class Task7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first word: ");
        String word1 = scan.next();
        System.out.println("Please enter second word: ");
        String word2 = scan.next();
        System.out.println("Please enter third word: ");
        String word3 = scan.next();

        int l1 = word1.length();
        int l2 = word2.length();
        int l3 = word3.length();

        if (l1==l2 && l2==l3) {
            System.out.println("All words are same length");
        } else if (l1==l2 || l1 == l3 || l2==l3) {
            System.out.println("Not Same nor Different lengths");
        } else {
            System.out.println("All different length");
        }

        scan.close();

    }
}
