package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArray2 {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int[] arr3 = {7,8,9};

        int[] arr4 = {10,20,30};
        int[] arr5 = {40,50,60};
        int[] arr6 = {70,80,90};

        int[][] arr2D1 = {arr1, arr2, arr3};
        int[][] arr2D2 = {arr4, arr5, arr6};

        int[][][] arr3D = {arr2D1, arr2D2};

        System.out.println(Arrays.deepToString(arr3D));
        System.out.println(Arrays.deepToString(arr3D[0]));
        //System.out.println(Arrays.deepToString(arr2D1));
        System.out.println(Arrays.toString(arr1));


        for (int[][] each2D : arr3D) {
            for (int[] each1D : each2D) {
                for (int element : each1D) {
                    System.out.print(element+" ");
                }
            }
        }
        System.out.println();
        System.out.println("--------------------------------------");

        int[][][][] arr4D = { { { {1, 2}, {3, 4} }, {{5, 6}, {7, 8}} }, {{{9, 10}, {11, 12}}, {{13, 14}, {15, 16}}}};

        for (int[][][] e3D : arr4D) {
            for (int[][] e2D : e3D) {
                for (int[] e1D : e2D) {
                    for (int element : e1D) {
                        System.out.print(element+" ");
                    }
                }
            }
        }




    }

}
