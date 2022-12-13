package day21_ForEachLoop.Tasks;

import java.util.Arrays;

public class T1 {
/*
1. Write a program that sort the array of integer in descending order
 */
    public static void main(String[] args) {

        int[] numbers = {6,3,1,4,7,5,2};
                       //1,2,3,4,5,6,7
        int[] reversed = new int[numbers.length];
        Arrays.sort(numbers);
        int i = numbers.length-1;
        for (int number : numbers) {
            reversed[i--] = number;
        }

        System.out.println(Arrays.toString(reversed));


    }

}
