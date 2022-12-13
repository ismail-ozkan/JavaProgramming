package day15_ForLoop.Tasks;

import java.util.Scanner;

public class PalindromeTask8 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String text1 = scan.nextLine();
        String text2 = "";


        boolean result1 = true;
        boolean result2 = true;

        //0123....
        //....3210

        for (int i = text1.length() - 1; i >= 0; i--) {
            text2 += text1.charAt(i);
        }
        System.out.println("text2 = " + text2);

        for (int i = 0; i <= (text1.length()-1); i++) {
            if (text1.charAt(i) == text2.charAt(i)) {
                result1 = true;
            } else {
                result2 = false;
            }

        }
        System.out.println(result1&&result2);
    }
}