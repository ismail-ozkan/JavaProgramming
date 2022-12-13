package day20_Arrays;

import java.util.Scanner;

public class T4 {
/*
4. AverageNumber:
			1. Ask the user how many numbers they want to enter
			2. get all the inputs from the user and store them into an array
			3. Iterate the array & return the average number

 */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many number would you like to enter?");
        int length = scan.nextInt();

        if (length<=0) System.exit(0);

        int[] numbers = new int[length];


        for (int i = 0; i < length; i++) {
            System.out.println("Enter a number:");
            numbers[i] = scan.nextInt();
        }

        double avarage = 0;
        for (int i = 0; i < length; i++) {
            avarage+=numbers[i];
        }
        avarage/=length;

        System.out.println("avarage = " + avarage);
    }


}
