package utilities;

public class MathUtility {

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }


    public static double sum(double num1, double num2) {
        return num1 + num2;
    }


    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }


    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }


    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }


    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }


    public static double division(double num1, double num2) {
        return num1 / num2;
    }


    public static boolean isOdd(int num) {
        return (num % 2 != 0) ? true : false;
    }


    public static boolean isEven(int num) {
        return (num % 2 == 0) ? true : false;
    }


    public static int max(int num1, int num2) {
        return (num1 > num2) ? num1 : num2;
    }


    public static double max(double num1, double num2) {
        return (num1 > num2) ? num1 : num2;
    }


    public static int min(int num1, int num2) {
        return (num1 < num2) ? num1 : num2;
    }


    public static double min(double num1, double num2) {
        return (num1 < num2) ? num1 : num2;
    }


    public static int square(int num) {
        return num * num;
    }


    public static double square(double num) {
        return num * num;
    }


    public static int cube(int num) {
        return num * num * num;
    }


    public static double cube(double num) {
        return num * num * num;
    }


}


  /*  //2.1 Create a method that can return the sum of two integers
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }
    //2.2 Create a method that can return the sum of two decimal numbers
    public static double sum(double num1, double num2) {
        return num1 + num2;
    }
    //2.3 Create a method that can return the subtraction of two integers
    public static int subtractionTwoNumber(int num1, int num2) {
        return num1 - num2;
    }
    //2.4 Create a method that can return the subtraction of two decimals
    public static double subtractionTwoNumber(double num1, double num2) {
        return num1 - num2;
    }
    //2.5 Creata a method that can return the multiplication of two integers
    public static int multiplicationTwoNumber(int num1, int num2) {
        return num1 * num2;
    }
    //2.6 Create a method that can return the multiplication of two decimals
    public static double multiplicationTwoNumber(double num1, double num2) {
        return num1 * num2;
    }
    //2.7 Create a method that passes two double parameters and return the division reslt
    public static double divisionTwoNumber(double num1, double num2) {
        return num1 / num2;
    }
    //2.8 Create a method that can check if an integer is even number
    public static void isEven(int num) {
        if (num%2==0) {
            System.out.println(num + " is even number");
        }
    }
    //2.9 Create a method that can check if an integer is odd number
    public static void isOdd(int num) {
        if (num%2==1) {
            System.out.println(num + " is odd number");
        }
    }
    //2.10 Create a method that can return the maximum number between two integers
    public static int maxNum(int num1, int num2){
        int max = num1;
        if (max<num2){
            max = num2;
        }
        return max;
    }
    //2.11 Create a method that can return the maximum number between two decimal numbers
    public static double maxNum(double num1, double num2){
        double max = num1;
        if (max<num2){
            max = num2;
        }
        return max;
    }
    //2.12 Create a method that can return the minimum number between two integers
    public static int minNum(int num1, int num2){
        int min = num1;
        if (min>num2){
            min = num2;
        }
        return min;
    }
    //2.13 Create a method that can return the minimum number between two decimal numbers
    public static double minNum(double num1, double num2){
        double min = num1;
        if (min>num2){
            min = num2;
        }
        return min;
    }
    //2.14 Create a method that can return the square of an integer
    public static int square(int num){
        int square = num*num;
        return square;
    }
    //2.15 Create a method that can return the square of a double
    public static double square(double num){
        double square = num*num;
        return square;
    }
    //2.16 Create a method that can return the cube of an integer
    public static int cube(int num){
        int cube = num*num*num;
        return cube;
    }
    //2.17 Create a method that can return the cube of a double
    public static double cube(double num){
        double cube = num*num*num;
        return cube;
    }*/

/*
            2.1 Create a method that can return the sum of two integers
			2.2 Create a method that can return the sum of two decimal numbers

			2.3 Create a method that can return the subtraction of two integers
			2.4 Create a method that can return the subtraction of two decimals

			2.5 Creata a method that can return the multiplication of two integers
			2.6 Creata a method that can return the multiplication of two decimals

			2.7 Create a method that passes two double parameters and return the division reslt

			2.8 Create a method that can check if an integer is even number
			2.9 Create a method that can check if an integer is odd number

			2.10 Create a method that can return the maximum number between two integers
			2.11 Create a method that can return the maximum number between two decimal numbers

			2.12 Create a method that can return the minimum number between two integers
			2.13 Create a method that can return the minimum number between two decimal numbers

			2.14 Create a method that can return the square of an integer
					Ex: square(2) ==> 4
			2.15 Create a method that can return the square of a double

			2.16 Create a method that can return the cube of an integer
			2.17 Create a method that can return the cube of a double

 */