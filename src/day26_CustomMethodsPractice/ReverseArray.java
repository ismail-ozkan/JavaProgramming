package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};

        int[] arr1Reversed = reverse(arr1);

        System.out.println(Arrays.toString(arr1Reversed));

    }

    public static int[] reverse(int[] array) {
        int[] result = {};

        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result,array[i]);
        }

        return result;
    }

}
