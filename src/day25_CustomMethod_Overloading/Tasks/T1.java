package day25_CustomMethod_Overloading.Tasks;

import java.util.Arrays;

public class T1 {

    public static void main(String[] args) {

        int[] array1 = {1,2,3};
        int[] array2 = {4,5,6,7};
        System.out.println(Arrays.toString(merge(array1, array2)));

        double[] array3 = {1.4,2.2,3.5};
        double[] array4 = {4,5,6,7.2};
        System.out.println(Arrays.toString(merge(array3, array4)));
        
    }

    public static int[] merge(int[] arr1, int[] arr2){
        int[] merged = new int[arr1.length+ arr2.length];
        int i = 0;
        for (int each : arr1) {
            merged[i++] = each;
        }
        for (int each : arr2) {
            merged[i++] = each;
        }
        return merged;
    }

    public static double[] merge(double[] arr1, double[] arr2){
        double[] merged = new double[arr1.length+ arr2.length];
        int i = 0;
        for (double each : arr1) {
            merged[i++] = each;
        }
        for (double each : arr2) {
            merged[i++] = each;
        }
        return merged;
    }

    public static char[] merge(char[] arr1, char[] arr2){
        char[] merged = new char[arr1.length+ arr2.length];
        int i = 0;
        for (char each : arr1) {
            merged[i++] = each;
        }
        for (char each : arr2) {
            merged[i++] = each;
        }
        return merged;
    }

    public static String[] merge(String[] arr1, String[] arr2){
        String[] merged = new String[arr1.length+ arr2.length];
        int i = 0;
        for (String each : arr1) {
            merged[i++] = each;
        }
        for (String each : arr2) {
            merged[i++] = each;
        }
        return merged;
    }
}
/*
Task1:
	1. create a method that can merge two integer arrays.

	2. create a method that can merge two double arrays.

	3. create a method that can merge two char arrays.

	4. create a method that can merge two String arrays.
 */