package day17_While_DoWhile;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = scan.nextInt();

        System.out.println("Enter second number: ");
        int num2 = scan.nextInt();

        System.out.println("Enter a math operator: 0");
        char ch = scan.next().charAt(0);

        /*if ( !(ch == '+' || ch == '-')) {
            System.err.println("Invalid Operator, Please re-enter: ");
            ch = scan.next().charAt(0);
        }*/
        while ( !(ch == '+' || ch == '-')) { //
            System.err.println("Invalid Operator, Please re-enter: ");
            ch = scan.next().charAt(0);
        }

        /* we can use for loop for this task but it is not good solution
        for ( int i=0; !(ch == '+' || ch == '-'); ) {
            System.err.println("Invalid Operator, Please re-enter: ");
            ch = scan.next().charAt(0);
        }
         */

        System.out.println((ch == '+')? num1+num2 : num1-num2);
    }

}
