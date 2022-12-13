package day18_NestedLoop;

public class DivideTwoNumber {

    public static void main(String[] args) {

        /*
        1.  Write a program that can divide two positive numbers
        without using / (division) and * (multiplication) and % operators
         */

        int num1 = 19;
        int num2 = 4;
        int divide = 0;


        while (num1>=num2) {
            num1-=num2;
            divide++;
        }

        System.out.println("divide = " + divide);
        System.out.println("remainder = " + num1);
    }

}
