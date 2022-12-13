package day24_CustomMethod_Return.Tasks;

import java.util.Arrays;

public class T6 {

    public static void main(String[] args) {

        int[] arr ={1,2,3};
        int number = 4;
        int[] newArr = addElement(arr,number);
        System.out.println(Arrays.toString(newArr));
    }

    public static int[] addElement(int[] array, int element) {
        int[] result = Arrays.copyOf(array, array.length+1);
        result[array.length]= element;
        return result;
    }


}
/*
6. create a method named addElement that takes one integer array and one integer,
 the method can add the Integer number after the  last index of the integer array and returns the new array

    			Ex:
    				arr ={1,2,3};
    				num = 4;

    				addElement(arr, num) ==> {1,2,3,4}
 */