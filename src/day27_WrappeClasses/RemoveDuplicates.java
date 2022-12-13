package day27_WrappeClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] arr = {10, 10, 20, 30, 40, 30, 30, 30};

        System.out.println(Arrays.toString(removeDuplicates(arr)));

    }

    //removes the duplicates from given array, return new array
    public static int[] removeDuplicates(int[] array) {
        int[] result = {};

        for (int each : array) {
            if (!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    //removes the duplicates from given array, return new array
    public static double[] removeDuplicates(double[] array) {
        double[] result = {};

        for (double each : array) {
            if (!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    //removes the duplicates from given array, return new array
    public static char[] removeDuplicates(char[] array) {
        char[] result = {};

        for (char each : array) {
            if (!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }
    
    //removes the duplicates from given array, return new array
    public static String[] removeDuplicates(String[] array) {
        String[] result = {};

        for (String each : array) {
            if (!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }
}
