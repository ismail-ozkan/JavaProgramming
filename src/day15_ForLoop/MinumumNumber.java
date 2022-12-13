package day15_ForLoop;

import java.util.Scanner;

public class MinumumNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int minimumNumber = 1231423414;

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter a number: ");
            int inputNumber = scan.nextInt();
            if (inputNumber<minimumNumber) {
                minimumNumber = inputNumber;
            }
        }
        System.out.println("minimumNumber = " + minimumNumber);

    }

}
