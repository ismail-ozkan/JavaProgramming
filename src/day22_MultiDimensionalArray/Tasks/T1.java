package day22_MultiDimensionalArray.Tasks;

import java.util.Arrays;

public class T1 {
/*
1. Write a program that can reverse a two dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};


		output:
			reverse = { {6,5,4}, {3,2,1} };
 */
    public static void main(String[] args) {

        int[][] array = { {1,2,3}, {4,5,6,7}};
        int[][] reverse = new int[array.length][];


        for (int i = array.length-1,j=0; i >= 0; i--,j++) {
            int[] temp = new int[array[i].length];
            for (int i1 = array[i].length-1,j1=0; i1 >= 0; i1--,j1++) {
                temp[j1] = array[i][i1];
            }
            reverse[j]= temp;
        }

        System.out.println(Arrays.deepToString(reverse));
    }

}
