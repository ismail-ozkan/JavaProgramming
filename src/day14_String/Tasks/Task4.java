package day14_String.Tasks;

import java.util.Scanner;

/*
 4. Ask user to enter two words. Then add them together and print.
    But if the last letter of the first word and the first letter of the last word is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight
 */
public class Task4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter first word: ");
        String firstWord = scan.nextLine().trim().toLowerCase();

        System.out.println("Please enter second word: ");
        String secondWord = scan.nextLine().trim().toLowerCase();
        String lastOfFirst = firstWord.substring(firstWord.length()-1);
        // 2. way for last character of first word
        char lastOfFirst2 = firstWord.charAt(firstWord.length()-1);
        String headOfSecond = secondWord.substring(0,1);
        // 2. way for first character of second word
        char headOfSecond2 = secondWord.charAt(0);
        if (lastOfFirst.equals(headOfSecond)) {
            System.out.println(firstWord+secondWord.substring(1));
        } else {
            System.out.println("Match not found\n" +
                    "Last letter of first word = " +lastOfFirst2+
                    "\nfirst letter of second word = " + headOfSecond2 );
        }
    }
}
