package day17_While_DoWhile.Tasks;

import java.util.Scanner;

/*
2. Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

            hint: you need an infinite loop

 */
public class Task2_SumWithLoop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        int sum = 0;
        while (num>=0) {
            sum += num;
            System.out.println("Enter a number: ");
            num = scan.nextInt();
        }
        System.out.println(sum);


    }

}
