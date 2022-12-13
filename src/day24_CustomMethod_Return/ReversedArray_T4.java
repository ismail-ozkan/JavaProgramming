package day24_CustomMethod_Return;

import java.util.Arrays;

public class ReversedArray_T4 {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};

        System.out.println(Arrays.toString(reveseArray(numbers)));

    }


    //4. create a method that return the reversed array
    //					{1,2,3,4,5} === > {5,4,3,2,1}
    public static int[] reveseArray(int[] intArray){

        int[] reversedArray = new int[intArray.length];

        for (int i = intArray.length-1, j=0; i >= 0; i--,j++) {
            reversedArray[j] = intArray[i];
        }

        return reversedArray;
    }

}
