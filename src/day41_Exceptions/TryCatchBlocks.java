package day41_Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks {

    public static void main(String[] args) {

        System.out.println("Test started");

        try {

            System.out.println(9 / 0);

            System.out.println("Try block");

        } catch (ArithmeticException e) {

            System.out.println("Catch Block");
            System.out.println("ArithmeticException was occurred");

        }

        System.out.println("Test 1 Completed");


        System.out.println("----------------------------");

        System.out.println("Test 2 Started");

        int[] numbers = {1, 2, 3, 4, 5};

        try {
            System.out.println(numbers[200]);

            System.out.println("Try Blocks");
        } catch (RuntimeException e) {//ArrayIndexOutOfBoundsException(sub class of IndexOutOfBoundsException)
            /*System.out.println("Catch Block");

            System.out.println("RuntimeException is occurred");*/
            e.printStackTrace();// common usage

            //System.out.println(e.getMessage());//Index 200 out of bounds for length 5

        }

        System.out.println("Test 2 Completed");

        System.out.println("----------------------------");


        System.out.println("Test 3 started");

        try {

            System.out.println("Cydeo".substring(2, 0));

        } catch (RuntimeException e) {
            e.printStackTrace();
        }

        System.out.println("Test 3 completed");

        System.out.println("------------------------------------------------------------------------------");

        System.out.println("Test 4 started");

        System.out.println("Hello");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Cydeo");

        System.out.println("Test 4 completed");

        System.out.println("---------------------------------------------------------------------------");

        System.out.println("Test 5 started");

        try {
            FileInputStream file = new FileInputStream("File path");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Test 5 completed");

    }
}
