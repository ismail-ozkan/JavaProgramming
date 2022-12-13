package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println("12" + 1); // 121 because it is concatenation
        System.out.println(10 + 20); //30 Addition
        System.out.println(100 - 50); //50 Subtraction
        System.out.println(10 * 5); // 50 Multiplication
        // Division and Remainder works different in Java

        System.out.println(100 / 3); // 33
        System.out.println(10 / 4); // 2
        System.out.println(10.0 / 4); // 2.5
        System.out.println(10 / 4.0); // 2.5
        System.out.println((double) 10 / 4); // 2.5
        System.out.println(10d / 4); // 2.5
        System.out.println(10 / 4d); // 2.5


        int a = 100;
        double b = a / 6; // 16.0 because a is integer and 6 is integer. And integer / integer ==> integer
        // after casting from int type to double type, 16 changes to 16.0 so result is 16.0.
        System.out.println("b = " + b); // 16.0

        double c = a /6.0;
        System.out.println(c); //16.666666666666668


        double d = (double)a /6;
        // d = 16.666666666666668
        System.out.println(d);
        double e = a /(double)6;
        // e = 16.666666666666668
        System.out.println(e);
        double f = a / 6D;
        // e = 16.666666666666668
        System.out.println(f);

    }

}
/*
    + : Addition
    - : Subtract
    * : Multiplication
    / : Division

            integer / integer =====> integer
            decimal / integer =====> decimal
            integer / decimal =====> decimal
            decimal / decimal =====> decimal

        in math:
            10/4 = 2.5
            100/3 = 33.333...
        in java:
            10/4 = 2 ( 10 is an integer number here)
            if you are expecting decimal result, make sure that one or two numbers is decimal
            10.0/4 = 2.5 ( 10 is a digit number here)
            100/3 = 33

    % : Remainer


 */