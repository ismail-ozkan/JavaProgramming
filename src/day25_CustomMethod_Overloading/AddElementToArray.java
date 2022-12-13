package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementToArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        int num = 5;

        arr = addInteger(arr,num);

        System.out.println(Arrays.toString(arr));

        double[] arr2 = {1.1,2.2,3.3,4.4};
        double num2 = 5.5;

        arr2 = addDouble(arr2,num2);
        System.out.println(Arrays.toString(arr2));

        char[] arr3 = {'c','d','y','e'};
        arr3 = addChar(arr3,'o');
        System.out.println(Arrays.toString(arr3));

        String[] arr4 = {"cydeo", "school", "wooden"};
        arr4 = addString(arr4, "spoon");
        System.out.println(Arrays.toString(arr4));
    }

    public static int[] addInteger(int[] array, int element) {

        int[] result = new int[array.length+1];
        int i = 0;
        for (int each : array) {
            result[i++]=each;
        }
        result[i] = element;


        return result;
    }

    public static double[] addDouble(double[] array, double element) {

        double[] result = new double[array.length+1];
        int i = 0;
        for (double each : array) {
            result[i++]=each;
        }
        result[i] = element;

        return result;
    }

    public static char[] addChar(char[] array, char word) {

        char[] result = new char[array.length+1] ;
        int i = 0;
        for (char each : array) {
            result[i++]=each;
        }
        result[i] = word;

        return result;

    }

    public static String[] addString(String[] array, String word) {

        String[] result = new String[array.length+1] ;
        int i = 0;
        for (String each : array) {
            result[i++]=each;
        }
        result[i] = word;

        return result;

    }
}
/*
Task2:
		1. create a return method called addInteger that can add an Inteeger  after the  last index of an integer array

					{1,2,3,4}, 5
					new array ==> {1,2,3,4,5}

	    2. create a return method called addDouble that can add a double after the last index of a double array

	    3. create a return method called addString that can add a String after the last index of a String array

	    4. create a return method called addChar that can add a char after last index of a char array
 */