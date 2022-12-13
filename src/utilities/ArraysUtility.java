package utilities;

import java.util.Arrays;

public class ArraysUtility {

    //PrintArray
    public static void soutArr(int[] array) {
        System.out.println(Arrays.toString(array));
    }
    //PrintArray
    public static void soutArr(double[] array) {
        System.out.println(Arrays.toString(array));
    }
    //PrintArray
    public static void soutArr(String[] array) {
        System.out.println(Arrays.toString(array));
    }
    //PrintArray
    public static void soutArr(char[] array) {
        System.out.println(Arrays.toString(array));
    }
    //PRİNT
    //print each integer of an array in separate lines
    public static void printEachElement(int[] array) {

        for (int each : array) {
            System.out.println(each);
        }

    }

    //print each double of an array in separate lines
    public static void printEachElement(double[] array) {

        for (double each : array) {
            System.out.println(each);
        }

    }

    //print each char of an array in separate lines
    public static void printEachElement(char[] array) {

        for (char each : array) {
            System.out.println(each);
        }

    }

    //print each String of an array in separate lines
    public static void printEachElement(String[] array) {

        for (String each : array) {
            System.out.println(each);
        }

    }

    //MAX - MİN
    // returns the maximum number from integer array
    public static int max(int[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    // returns the maximum number from double array
    public static double max(double[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    // returns the minimum number from integer array
    public static int min(int[] array) {
        Arrays.sort(array);
        return array[0];
    }

    // returns the minimum number from double array
    public static double min(double[] array) {
        Arrays.sort(array);
        return array[0];
    }

    //CONTAİN
    //checks if the given integer is contained in the given array. returns boolean.  contains(int[], int)
    public static boolean contains(int[] array, int element) {
        boolean result = false;

        for (int each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }

    //checks if the given double is contained in the given array. returns boolean.
    public static boolean contains(double[] array, double element) {
        boolean result = false;

        for (double each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }

    //checks if the given char is contained in the given array. returns boolean.
    public static boolean contains(char[] array, char element) {
        boolean result = false;

        for (char each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }

    //checks if the given String is contained in the given array. returns boolean.
    public static boolean contains(String[] array, String element) {
        boolean result = false;

        for (String each : array) {
            if (each.equals(element)) {
                result = true;
            }
        }
        return result;
    }

    //FREQUENCY
    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(int[] array, int element) {
        int count = 0;
        for (int each : array) {
            if (each == element) {
                count++;
            }
        }

        return count;
    }

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(double[] array, double element) {
        int count = 0;
        for (double each : array) {
            if (each == element) {
                count++;
            }
        }

        return count;
    }

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(char[] array, char element) {
        int count = 0;
        for (char each : array) {
            if (each == element) {
                count++;
            }
        }

        return count;
    }

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(String[] array, String element) {
        int count = 0;
        for (String each : array) {
            if (each.equals(element)) {
                count++;
            }
        }

        return count;
    }

    //ADD
    // adds the given element to array, returns a new array
    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];

        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }

        result[i] = element;

        return result;
    }

    // adds the given element to array, returns a new array
    public static double[] addElement(double[] array, double element) {
        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }

        result[result.length - 1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }

    // adds the given element to array, returns a new array
    public static String[] addElement(String[] array, String element) {
        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }

        result[result.length - 1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }

    // adds the given element to array, returns a new array
    public static char[] addElement(char[] array, char element) {
        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }

        result[result.length - 1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }

    //REMOVE
    //removes the index from the array, returns new array
    public static int[] removeElement(int[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }

        int[] result = {};

        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            result = ArraysUtility.addElement(result, array[i]);
        }

        return result;

    }

    //removes the index from the array, returns new array
    public static double[] removeElement(double[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }

        double[] result = {};

        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            result = ArraysUtility.addElement(result, array[i]);
        }

        return result;

    }

    //removes the index from the array, returns new array
    public static char[] removeElement(char[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }

        char[] result = {};

        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            result = ArraysUtility.addElement(result, array[i]);
        }

        return result;

    }

    //removes the index from the array, returns new array
    public static String[] removeElement(String[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }

        String[] result = {};

        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            result = ArraysUtility.addElement(result, array[i]);
        }

        return result;

    }

    //MERGE
    //merge the given two arrays and returns the new array
    public static int[] merge(int[] arr1, int[] arr2) {

        int[] result = {};//new int[arr1.length+ arr2.length];

        for (int each : arr1) {
            result = addElement(result,each);
        }
        for (int each : arr2) {
            result = addElement(result,each);
        }
        return result;
    }

    //merge the given two arrays and returns the new array
    public static double[] merge(double[] arr1, double[] arr2) {

        double[] result = {};//new double[arr1.length+ arr2.length];

        for (double each : arr1) {
            result = addElement(result,each);
        }
        for (double each : arr2) {
            result = addElement(result,each);
        }
        return result;
    }

    //merge the given two arrays and returns the new array
    public static char[] merge(char[] arr1, char[] arr2) {

        char[] result = {};//new char[arr1.length+ arr2.length];

        for (char each : arr1) {
            result = addElement(result,each);
        }
        for (char each : arr2) {
            result = addElement(result,each);
        }
        return result;
    }
    
    //merge the given two arrays and returns the new array
    public static String[] merge(String[] arr1, String[] arr2) {

        String[] result = {};//new String[arr1.length+ arr2.length];

        for (String each : arr1) {
            result = addElement(result,each);
        }
        for (String each : arr2) {
            result = addElement(result,each);
        }
        return result;
    }

    //REVERSE
    //reverses the given array, return a new array
    public static int[] reverse(int[] array) {
        int[] result = {};

        for (int i = array.length - 1; i >= 0; i--) {
            result = addElement(result,array[i]);
        }

        return result;
    }

    //reverses the given array, return a new array
    public static double[] reverse(double[] array) {
        double[] result = {};

        for (int i = array.length - 1; i >= 0; i--) {
            result = addElement(result,array[i]);
        }

        return result;
    }

    //reverses the given array, return a new array
    public static char[] reverse(char[] array) {
        char[] result = {};

        for (int i = array.length - 1; i >= 0; i--) {
            result = addElement(result,array[i]);
        }

        return result;
    }

    //reverses the given array, return a new array
    public static String[] reverse(String[] array) {
        String[] result = {};

        for (int i = array.length - 1; i >= 0; i--) {
            result = addElement(result,array[i]);
        }

        return result;
    }

    //REPLACE
    //replace the element of the array at given index with the new element
    public static int[] replace(int[] array, int index, int newElement) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }
        int[] result = Arrays.copyOf(array, array.length);
        result[index] = newElement;
        return result;
    }

    //replace the element of the array at given index with the new element
    public static double[] replace(double[] array, int index, double newElement) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }
        double[] result = Arrays.copyOf(array, array.length);
        result[index] = newElement;
        return result;
    }

    //replace the element of the array at given index with the new element
    public static char[] replace(char[] array, int index, char newElement) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }
        char[] result = Arrays.copyOf(array, array.length);
        result[index] = newElement;
        return result;
    }

    //replace the element of the array at given index with the new element
    public static String[] replace(String[] array, int index, String newElement) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }
        String[] result = Arrays.copyOf(array, array.length);
        result[index] = newElement;
        return result;
    }

    //REPLACE ALL
    // replaces all the matching old values given of the given array with the given new value
    public static int[] replaceAll(int[] array, int oldValue, int newValue) {

        for (int i = 0; i < array.length; i++) {
            if (array[i]==oldValue) {
                array[i] = newValue;
            }
        }
        return array;
    }

    // replaces all the matching old values given of the given array with the given new value
    public static double[] replaceAll(double[] array, double oldValue, double newValue) {

        for (int i = 0; i < array.length; i++) {
            if (array[i]==oldValue) {
                array[i] = newValue;
            }
        }
        return array;
    }

    // replaces all the matching old values given of the given array with the given new value
    public static char[] replaceAll(char[] array, char oldValue, char newValue) {

        for (int i = 0; i < array.length; i++) {
            if (array[i]==oldValue) {
                array[i] = newValue;
            }
        }
        return array;
    }

    // replaces all the matching old values given of the given array with the given new value
    public static String[] replaceAll(String[] array, String oldValue, String newValue) {

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(oldValue)) {
                array[i] = newValue;
            }
        }
        return array;
    }


    //REMOVE DUPLİCATES
    //removes the duplicates from given array, return new array
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

    //INSERT
    //inserts the given element to the given index of the array and returns the new array
    public static int[] insert(int[] array,int index, int element){
        int[] result = new int[array.length+1];
        for (int i = 0, j = 0; i < array.length; i++,j++) {
            if (index==i) j++;
            result[j] = array[i];
        }
        result[index] = element;
        return result;
    }

    //inserts the given element to the given index of the array and returns the new array
    public static double[] insert(double[] array,int index, double element){
        double[] result = new double[array.length+1];
        for (int i = 0, j = 0; i < array.length; i++,j++) {
            if (index==i) j++;
            result[j] = array[i];
        }
        result[index] = element;
        return result;
    }

    //inserts the given element to the given index of the array and returns the new array
    public static char[] insert(char[] array,int index, char element){
        char[] result = new char[array.length+1];
        for (int i = 0, j = 0; i < array.length; i++,j++) {
            if (index==i) j++;
            result[j] = array[i];
        }
        result[index] = element;
        return result;
    }

    //inserts the given element to the given index of the array and returns the new array
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


