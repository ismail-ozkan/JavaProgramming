package day08_IfStatement;

public class IdentifyNumber {

    public static void main(String[] args) {

        int number = 0;

        boolean isPositive = number > 0;
        boolean isNegative = number < 0;
        boolean isZero = number == 0;

        System.out.println(number + " is positive number: " + isPositive);
        System.out.println(number + " is negative number: " + isNegative);
        System.out.println(number + " is zero: " + isZero);


        int number2 = 220;

        boolean isPositive2 = number2 > 0;
        boolean isNegative2 = number2 < 0;
        boolean isZero2 = number2 == 0;

        System.out.println(number2 + " is positive number2: " + isPositive2);
        System.out.println(number2 + " is negative number2: " + isNegative2);
        System.out.println(number2 + " is zero: " + isZero2);


    }
}
/*
1. Create a class called IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.

			Ex:
				number = 200

			output:
		        200 is positive number: true
		        200 is negative number: false
		        200 is zero: false

 */