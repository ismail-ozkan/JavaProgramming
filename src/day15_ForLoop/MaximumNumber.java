package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int maximumNumber = -12;

        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter a number: ");
            int inputNumber = scan.nextInt();

            if (maximumNumber<inputNumber) {
                maximumNumber=inputNumber;
            }
            /*My solution
            if (maximumNumber>inputNumber) {
                maximumNumber = maximumNumber;
            } else {
                maximumNumber = inputNumber;
            }*/
        }

        System.out.println("maximumNumber = " + maximumNumber);
    }

}
