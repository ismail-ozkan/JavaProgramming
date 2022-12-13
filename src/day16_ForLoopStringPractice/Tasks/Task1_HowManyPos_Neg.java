package day16_ForLoopStringPractice.Tasks;

import java.util.Scanner;

public class Task1_HowManyPos_Neg {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int pos = 0;
        int neg = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter " + i + ". number: ");
            int num = scan.nextInt();
            if (num<0) {
                neg++;
            } else if (num>0) {
                pos++;
            }
        }
        System.out.println(pos + " positive and " + neg + " negative");

    }

}
/*
1. Write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative
 */