package day25_CustomMethod_Overloading.Tasks;

import java.util.Arrays;

public class T5XX {
    
    public static void reverse(int[] array) {
        
        int[] reversed = new int[array.length];
        
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = array[i];
        }
        System.out.println(Arrays.toString(reversed));
    }

    public static void reverse(double[] array) {

        double[] reversed = new double[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = array[i];
        }
        System.out.println(Arrays.toString(reversed));
    }

    public static void reverse(char[] array) {

        char[] reversed = new char[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = array[i];
        }
        System.out.println(Arrays.toString(reversed));
    }

    public static void reverse(String[] array) {

        String[] reversed = new String[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = array[i];
        }
        System.out.println(Arrays.toString(reversed));
    }
}
/*
Task 4:
	1. Create a method that can reverse an integer array

	2. Create a method that can reverse a double array

	3. Create a method that can reverse a char array

	4. Create a method that can reverse a String array
 */