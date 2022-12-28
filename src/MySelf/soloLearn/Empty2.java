package MySelf.soloLearn;

import java.util.Arrays;
import java.util.Scanner;

public class Empty2 {


    public static void main(String[] args) {

        /*Scanner scan = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a number");
            arr[i] = scan.nextInt();
        }

        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[9];

        System.out.println("min = " + min);
        System.out.println("max = " + max);
*/

        int[] array = {10, 0, 5, 0, 1, 10};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i]> array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

}
/*
3. Write a program that asks user to enter a number 10 times:
			1. store all user entered numbers in an array
			2. find the max number
			3. find the min number
 */
/*
    6. write a program that can move all the zeros to the end of the array
            Ex:
                array = {10, 0, 5, 0, 1, 0};

                output:
                     {10, 5, 1, 0, 0, 0}
     */