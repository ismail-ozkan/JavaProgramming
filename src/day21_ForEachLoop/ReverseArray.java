package day21_ForEachLoop;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7};
        int[] reversed = new int[numbers.length];
        //int[] reversed2 = Arrays.copyOf(numbers, numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            reversed[numbers.length-1-i] = numbers[i];
        }
        /*Second Solution
        int a =numbers.length-1;
        for (int number : numbers) {
            reversed[a--] = number;
        }*/
        /*Third Solution
        for (int i = numbers.length-1; i >= 0; i--) {
            reversed[i] = numbers[numbers.length-1-i];
        }*/
        System.out.println(Arrays.toString(reversed));
    }
}