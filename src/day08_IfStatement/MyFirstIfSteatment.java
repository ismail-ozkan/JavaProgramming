package day08_IfStatement;

public class MyFirstIfSteatment {

    public static void main(String[] args) {

        int num1 = 124;
        int num2 = 3;


        int division = num1 / num2;   // 8
        int remainder = num1 % num2;    // 1

        // 10 divide by 3 is equal to 3 with a remainder of 1.

        if (remainder == 0) {
            System.out.println(num1 + " divide by " + num2 + " is equal to " + division + " with a remainder of "
                    + remainder + ".");
        }
        else {
            System.out.println(num1 + " divide by " + num2 + " is equal to " + division + " with no remainder.");
        }

        System.out.println("------------------------");
/*
        Write a program that can swipe two variables' value without using a temporary variable
*/




    }
}
