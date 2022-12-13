package x_adam_only;

import java.util.Arrays;

public class Fibonacci {

    public static void main(String[] args) {
        fibonacci(8);
        System.out.println(fibonacciX(7));
        System.out.println(Arrays.toString(fibonacciArr(6)));

    }

    public static void fibonacci(int x){

        int[] array = new int[x+1];

        array[0] = 0;
        array[1] = 1;

        for (int i = 2; i < x+1; i++) {
            array[i] = array[i-2]+array[i-1];
        }
        System.out.println(Arrays.toString(array));
    }
    public static int fibonacciX(int x){

        int[] array = new int[x+1];

        array[0] = 0;
        array[1] = 1;

        for (int i = 2; i < x+1; i++) {
            array[i] = array[i-2]+array[i-1];
        }
        return array[x];
    }
    public static int[] fibonacciArr(int x){

        int[] array = new int[x+1];

        array[0] = 0;
        array[1] = 1;

        for (int i = 2; i < x+1; i++) {
            array[i] = array[i-2]+array[i-1];
        }
        return array;
    }

}
/*
Task 6 :  Fibonacci

            Create a method that will give you the Fibonacci numbers up to the x value. Where x is the given parameter.

            Fibonacci is a sequence of number starting from 0, 1 where the following numbers are the sum of the previous 2 numbers

            Note: Fibonacci numbers are read as index values, so the 0th Fibonacci is 0, 1st value is 1, 2nd value is 1, etc

                    Ex:
                        Input:
                            8
                        Output:
                            0, 1, 1, 2, 3, 5, 8, 13, 21

                            1- Create one method and only print the numbers
                            2- You will return the numbers
                            3- You will put that numbers into the array then you will return it
 */