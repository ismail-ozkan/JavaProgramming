package day21_ForEachLoop;

import java.util.Arrays;

public class Task1_MergeArrays {
/*
 1. write a program that can merge two arrays of integers
		Ex:
			arr1 = {1,2,3,4}
			arr2 = {5,6}

		output
			arr3 = {1,2,3,4,5,6}
 */
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6};

        int[] arr3 = Arrays.copyOf(arr1,arr1.length+arr2.length);
        int l1 = arr1.length;
        for (int i : arr2) {
            arr3[l1++] = i;
        }

        System.out.println(Arrays.toString(arr3));

        System.out.println("-----------------------------------");

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'D', 'E', 'F', 'G', 'H'};

        char[] chars = new char[ch1.length + ch2.length];
        int j = 0;
        for (char c : ch1) {
            chars[j++] = c;
        }
        for (char c : ch2) {
            chars[j++] = c;
        }

        System.out.println(Arrays.toString(chars));
    }

}
