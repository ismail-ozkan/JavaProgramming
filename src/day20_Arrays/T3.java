package day20_Arrays;

import java.util.Scanner;

public class T3 {
/*
3. Write a program that asks user to enter a number 10 times:
			1. store all user entered numbers in an array
			2. find the max number
			3. find the min number
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

        int maxNum = 0;// int minNum = numbers[0];
        for (int i = 0; i < length; i++) {
            int num1 = numbers[i];
            for (int j = 0; j < length; j++) {
                if (num1< maxNum) continue;
                if (num1>=numbers[j]) maxNum=num1;
            }
        }

        int minNum = 999999999; // int minNum = numbers[0];
        for (int i = 0; i < length; i++) {
            int num2 = numbers[i];
            for (int j = 0; j < length; j++) {
                if (num2> minNum) continue;
                if (num2<=numbers[j]) minNum=num2;
            }
        }


        System.out.println("maxNum = " + maxNum);
        System.out.println("minNum = " + minNum);

        /* IMPORTANT
        int[] numbers = {10, 5, 4, 20, 1, 0};
        int min = numbers[0];// 20

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]<min) min=numbers[i];
        }

        System.out.println("min = " + min);
         */
    }

}
