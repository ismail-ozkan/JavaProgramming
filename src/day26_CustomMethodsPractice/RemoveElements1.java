package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveElements1 {

    public static void main(String[] args) {

        int[] arr = {10,20,30,40,30};
         //==> {10, 20, 40}
        System.out.println(Arrays.toString(removeElement(arr, 2)));

    }


    public static int[] removeElement(int[] array, int index) {

        if (index<0 || index>array.length-1){
            System.err.println("Invalid index: "+index);
            System.exit(0);
        }

        int[] result = {};

        for (int i = 0; i < array.length; i++) {
            if (i==index) {
                continue;
            }
            result = ArraysUtility.addElement(result,array[i]);
        }

        return result;
    }

}
/*
2. Create a class named RemoveElements:
			2.1 Create a method that passes two parametetrs: an integer array and an integer index. the method removes the element at the given index of the array and returns the new array
					Ex:
						int[] arr = {10,20,30,40}
						removeElement(arr, 2) ==> {10, 20, 40}
			2.2 Create a method that passes two parametetrs: a double array and an integer index. the method removes the element at the given index of the array and returns the new array
			2.3 Create a method that passes two parametetrs: a char array and an integer index. the method removes the element at the given index of the array and returns the new array
			2.4 Create a method that passes two parametetrs: a String array and an integer index. the method removes the element at the given index of the array and returns the new array
 */