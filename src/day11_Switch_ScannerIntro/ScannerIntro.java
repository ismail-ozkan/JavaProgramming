package day11_Switch_ScannerIntro;

import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a integer: ");
        int num1 = input.nextInt();

        System.out.println("Enter a decimal: ");
        double num2 = input.nextDouble();

        System.out.println(num1);
        System.out.println(num2);

        System.out.println("Multiplication: " + (num1*num2));

        input.close();// if we don't use anymore, closing the Scanner is better for performance
/*
        int num3 = input.nextInt();// after closing we cannot use Scanner

        System.out.println(num3);

 */
    }
}
