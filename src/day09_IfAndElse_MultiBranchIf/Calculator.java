package day09_IfAndElse_MultiBranchIf;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        double n1, n2;
        int mathOperartor;

        Scanner inputs = new Scanner(System.in);
        System.out.println("Enter a number:");
        n1 = inputs.nextDouble();
        System.out.println("Enter a number:");
        n2 = inputs.nextDouble();
        System.out.println("Enter the \"NUMBER\" of Operation below options:\n" +
                "1.Subtraction(-)\n2.Addition(+)\n3.Multiplication(*)\n4.Division(/)");
        mathOperartor = inputs.nextInt();

        if (mathOperartor==1) {
            System.out.println(n1+" + "+n2+" = "+(n1+n2));
        } else if (mathOperartor==2) {
            System.out.println(n1+" - "+n2+" = "+(n1-n2));
        } else if (mathOperartor==3) {
            System.out.println(n1+" * "+n2+" = "+(n1*n2));
        } else if (mathOperartor==4) {
            System.out.println(n1+" / "+n2+" = "+(n1/n2));
        }else {
            System.out.println("invalid operator number");
        }


    }
}
/*
2. Create a class called Calculator, Given two double variables named n1 & n2, and a char variable named mathOperator, write a program that can calculate result of n1&n2 based on the given math Operator.

		char operator -> -, +, *, /

		when operator is + : add num1, num2
		when operator: - : minus num1, num2
		when operator: * : multiply num1, num2
		when operator: / : divide num1, num2
		for any other operators: print "invalid operator"

		Ex:
			n1 = 10, n2= 20, mathOperator = '+'

		output:
			30
 */