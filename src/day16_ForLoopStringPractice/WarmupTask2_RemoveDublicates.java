package day16_ForLoopStringPractice;

import java.util.Scanner;

public class WarmupTask2_RemoveDublicates {
/*
2. Write a program that can remove the duplicated characters from a String
			Ex:
				input:
					AABBCCBC

				Output:
					ABC

			Hint: You can add each characters of the string into another String
			Condition: the character is not contained in the other String yet before you are adding
 */
    public static void main(String[] args) {

        System.out.println("Enter a String: ");
        String input = new Scanner(System.in).nextLine();
        String result = "";

        for (int i = 0; i<input.length(); i++) {
            if (!result.contains(""+input.charAt(i))) {
                result += input.charAt(i);
            }
        }
        System.out.println(result);



    }

}
