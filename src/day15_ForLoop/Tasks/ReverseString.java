package day15_ForLoop.Tasks;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String text = scan.nextLine();

        //"01234567...."
        //"....76543210"

        String result = "";

        for (int i=text.length()-1; i>=0; i--) {
            result += text.charAt(i);
        }

        System.out.println(result);
    }
}
