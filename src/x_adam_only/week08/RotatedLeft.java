package x_adam_only.week08;

import java.util.Arrays;

public class RotatedLeft {

    public static void main(String[] args) {

        int[] x = {1,2,3};
        int[] y = {17,12,10,8};
        int[] James = {7,0,0};

        int[] tempX = Arrays.copyOf(x,x.length);
        for (int i = 0; i < x.length; i++) {
            if (i== x.length-1){// for only last index
                x[i]=tempX[0];
                continue;
            }
            x[i]=x[i+1];
        }
        System.out.println(Arrays.toString(x));
        int[] tempY = Arrays.copyOf(y,y.length);
        for (int i = 0; i < y.length; i++) {
            if (i== y.length-1){
                y[i]=tempY[0];
                continue;
            }
            y[i]=y[i+1];
        }
        System.out.println(Arrays.toString(y));
        int[] tempJames = Arrays.copyOf(James,James.length);
        for (int i = 0; i < James.length; i++) {
            if (i== James.length-1){
                James[i]=tempJames[0];
                continue;
            }
            James[i]=James[i+1];
        }
        System.out.println(Arrays.toString(James));
    }

}
/*
Task 1    : Write a program that accepts an array and prints an array with the elements "rotated left"

		int[] x = {1,2,3};			 // = > [2,3,1]
		int[] x = {1,2,3};		 // = > [12,10,8,17]
		int[] a = {7,0,0}; 			 // = > [0,0,7]
 */