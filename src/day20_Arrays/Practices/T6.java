package day20_Arrays.Practices;

import java.util.Arrays;

public class T6 {
    /*
    6. write a program that can move all the zeros to the end of the array
            Ex:
                array = {10, 0, 5, 0, 1, 0};

                output:
                     {10, 5, 1, 0, 0, 0}
     */
    public static void main(String[] args) {

        int[] array = {10, 0, 5, 0, 1, 2};
        int[] result = new int[array.length];
        Arrays.sort(array);
        for (int length = array.length-1, i = 0; length >= 0; length--, i++) {
            result[i] = array[length];
        }
        System.out.println(Arrays.toString(result));

    }


}

