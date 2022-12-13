package day22_MultiDimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray2 {

    public static void main(String[] args) {

        int[][] arr2D = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };

        for (int l = arr2D.length-1; l >= 0; l--) {
            //System.out.println(Arrays.toString(arr2D[l]));
            for (int i : arr2D[l]) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

        System.out.println("----------------------------------------------");

        for (int[] ints : arr2D) {
            for (int l = ints.length-1; l >= 0; l--) {
                System.out.print(ints[l]+" ");
            }
            System.out.println();
        }

        System.out.println("----------------------------------------------");

        for (int i = arr2D.length-1; i >= 0; i--) {
            for (int j = arr2D[i].length-1; j >= 0; j--) {
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------");





    }
}
/*
task1:
                9 10 11 12 13
                4 5 6 7 8
                1 2 3

task2:
                3 2 1
                8 7 6 5 4
                13 12 11 10 9

 task3:
                13 12 11 10 9
                8 7 6 5 4
                3 2 1
 */