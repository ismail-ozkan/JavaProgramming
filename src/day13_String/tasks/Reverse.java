package day13_String.tasks;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string with 5 chararcters:");
        String str = scan.nextLine();


        if (str.length()==5) {
            char ch1 = str.charAt(4);
            char ch2 = str.charAt(3);
            char ch3 = str.charAt(2);
            char ch4 = str.charAt(1);
            char ch5 = str.charAt(0);
            String reverse = ""+ ch1 + ch2 + ch3 + ch4 + ch5;

            System.out.println(reverse);
        } else if (str.length()<5) {
            System.out.println("Too short!");
        } else {
            System.out.println("Too long!");
        }

        scan.close();

    }

}
/*
1.  Create a class called Reverse, write a program that will reverse a string.
Your program should reverse a string only 5 characters long.
	If word is shorter, display message: "Too short!".
        If word is longer, display message: "Too long!".
	Otherwise, reverse this word and print out result into the console.

 */