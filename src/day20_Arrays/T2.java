package day20_Arrays;

import java.util.Arrays;

public class T2 {
/*
2. create an array that has the numbers 100 to 1
 */
    public static void main(String[] args) {

        int number100_1[] = new int[100];

        for (int i = 0, j = 100; i < 100; i++, j--) {
            number100_1[i] = j;
        }

        System.out.println(Arrays.toString(number100_1));



    }

}
