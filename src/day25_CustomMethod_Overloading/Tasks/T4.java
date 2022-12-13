package day25_CustomMethod_Overloading.Tasks;

import java.util.Arrays;

public class T4 {
    
    public static void reverse(int[] array) {
        int[] reversed = new int[array.length];
        int c = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reversed[c] = array[i];
        }
        System.out.println(Arrays.toString(reversed));
    }

    public static void reverse(double[] array) {
        double[] reversed = new double[array.length];
        int c = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reversed[c] = array[i];
        }
        System.out.println(Arrays.toString(reversed));
    }

    public static void reverse(char[] array) {
        char[] reversed = new char[array.length];
        int c = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reversed[c] = array[i];
        }
        System.out.println(Arrays.toString(reversed));
    }

    public static void reverse(String[] array) {
        String[] reversed = new String[array.length];
        int c = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reversed[c] = array[i];
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