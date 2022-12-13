package day12_Scanner.Practices;

import java.util.Scanner;

public class CentsToDollar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter cent amount: ");
        int cent = input.nextInt();

        if (cent%100==0) {
            System.out.println(cent+" cents equal to: " + (cent/100));
        } else {
            System.out.println(cent+" cents equal to: " + (cent/100)+" dollars and "+(cent%100)+" cents");
        }

    }

}
/*
3. Write a program that can convert cents to dollars, if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents
 */