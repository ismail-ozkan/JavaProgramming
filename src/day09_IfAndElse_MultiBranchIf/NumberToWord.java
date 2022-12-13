package day09_IfAndElse_MultiBranchIf;

import java.util.Scanner;

public class NumberToWord {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a figure at below line:");
        int number = input.nextInt();

        int zero = 0;

        if (number==zero++){
            System.out.println("Zero");
        } else if (number==zero++) {
            System.out.println("One");
        } else if (number==zero++) {
            System.out.println("Two");
        } else if (number==zero++) {
            System.out.println("Three");
        } else if (number==zero++) {
            System.out.println("Four");
        } else if (number==zero++) {
            System.out.println("Five");
        } else if (number==zero++) {
            System.out.println("Six");
        } else if (number==zero++) {
            System.out.println("Seven");
        } else if (number==zero++) {
            System.out.println("Eight");
        } else if (number==zero++) {
            System.out.println("Nine");
        } else {
            System.out.println("Invalid number");
        }
    }
}
/*
1. Create a class called NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One
 */