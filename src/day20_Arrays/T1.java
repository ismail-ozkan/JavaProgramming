package day20_Arrays;

import java.util.Arrays;

public class T1 {
/*
1. create an array that has the numbers 1 to 100
 */
    public static void main(String[] args) {

        int[] numbers1_100 = new int[100];

        for (int i = 0; i < numbers1_100.length; i++) {
            numbers1_100[i] = i+1;
        }

        System.out.println(Arrays.toString(numbers1_100));

    }

}
