package day16_ForLoopStringPractice;

import java.util.Scanner;

/*
3. Write a program that can return the unique characters from a String

			Ex:
				input:
					AABCCD

				output:
					BD

			Hint: You will need indexOf() and lastIndexOf()
				  if the first and last index numbers of the character are same, then it's unique
 */
public class WarmupTask3_UniqueChar {

    public static void main(String[] args) {

        System.out.println("Enter a String: ");
        String input = new Scanner(System.in).nextLine();
        String result = "";

        for (int i=0; i<input.length(); i++){
            if (input.indexOf(input.charAt(i))==input.lastIndexOf(input.charAt(i))) {
                result += input.charAt(i);
            }
        }

        System.out.println(result);

    }
}
