package day14_String.Tasks;

import java.util.Scanner;

/*
3. Ask user to enter a word. If the word starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
 */
public class Task3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please Enter a word: ");
        String word = scan.next();

        String firstLetter = word.substring(0,1);

        if (firstLetter.equals("x")){
            System.out.println(word.substring(1));
        } else {
            System.out.println(word);
        }

    }

}


