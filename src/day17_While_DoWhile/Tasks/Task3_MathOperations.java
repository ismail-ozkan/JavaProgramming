package day17_While_DoWhile.Tasks;

import java.util.Scanner;

/*
3. write a program to ask user to enter two number and math operator, and return the result.

		if the operator is invalid operator,
		 ask user to re-enter the operator until user provides a valid operator (+, -, *, /)
 */
public class Task3_MathOperations {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter a number: ");
        int num2 = scan.nextInt();
        System.out.println("Enter a operator: (+, -, *, /)");
        char ch = scan.next().charAt(0);

        while (!(ch=='+'||ch=='-'||ch=='*'||ch=='/')) {
            System.out.println("Enter a operator: (+, -, *, /)");
            ch = scan.next().charAt(0);
        }

        if (ch=='+'){
            System.out.println(num1+" + "+num2+" = "+(num1+num2));
        } else if (ch=='-') {
            System.out.println(num1+" - "+num2+" = "+(num1-num2));
        } else if (ch=='*') {
            System.out.println(num1+" * "+num2+" = "+(num1*num2));
        } else
            System.out.println(num1+" / "+num2+" = "+(num1/num2));
        }
    }
