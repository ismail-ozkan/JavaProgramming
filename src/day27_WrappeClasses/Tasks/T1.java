package day27_WrappeClasses.Tasks;

import utilities.ArraysUtility;

import java.util.Arrays;

public class T1 {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        arr = insert(arr, 2, 100);

        ArraysUtility.soutArr(arr); // == System.out.println(Arrays.toString(arr));

    }

    public static int[] insert(int[] array,int index, int element){
        int[] result = new int[array.length+1];
        for (int i = 0, j = 0; i < array.length; i++,j++) {
            if (index==i) j++;
            result[j] = array[i];
        }
        result[index] = element;
        return result;
    }
    public static double[] insert(double[] array,int index, double element){
        double[] result = new double[array.length+1];
        for (int i = 0, j = 0; i < array.length; i++,j++) {
            if (index==i) j++;
            result[j] = array[i];
        }
        result[index] = element;
        return result;
    }
    public static char[] insert(char[] array,int index, char element){
        char[] result = new char[array.length+1];
        for (int i = 0, j = 0; i < array.length; i++,j++) {
            if (index==i) j++;
            result[j] = array[i];
        }
        result[index] = element;
        return result;
    }
    public static String[] insert(String[] array,int index, String element){
        String[] result = new String[array.length+1];
        for (int i = 0, j = 0; i < array.length; i++,j++) {
            if (index==i) j++;
            result[j] = array[i];
        }
        result[index] = element;
        return result;
    }
}
/*
1. Insert Task:
		1.1 Create a method named insert that passes three parameters: integer array, integer index, integer element.
		 the method inserts the given element to the given index of the array and returns the new array
				Ex:
					arr = {10, 20, 30, 40, 50};

					insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


		1.2 Create the same function for double array, char array and string array
 */