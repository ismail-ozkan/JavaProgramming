package day18_NestedLoop;

import java.util.Scanner;

public class AdditionOfTwoNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your first number");
            int num1 = scan.nextInt();

            System.out.println("Enter your second number");
            int num2 = scan.nextInt();

            System.out.println("Addition: " + (num1 + num2));


            System.out.println("Would you like to continue?");
            String yesNo = scan.next().toLowerCase();

            while (!(yesNo.equals("no") || yesNo.equals("yes"))) {
                System.err.println("Invalid Entry, re enter");
                yesNo = scan.next().toLowerCase();
            }

            if (yesNo.equals("no")) {
                break;
            }
        }

    }

}
