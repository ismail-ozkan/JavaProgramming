package day16_ForLoopStringPractice;

import java.util.Scanner;

public class WarmupTask1_Reverse {
/*
1. Write a program that can reverse a String
			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW
 */
    public static void main(String[] args) {

        System.out.println("Enter a string: ");
        String input = new Scanner(System.in).nextLine();
        String reverse = "";
        //0123...
        //...3210

        for (int index = input.length()-1; index>=0; index--) {
            reverse += input.charAt(index);
        }

        System.out.println(reverse);

        System.out.println(reverse.contains(input.charAt(0)+""));

    }

}
