package day09_IfAndElse_MultiBranchIf;

import java.util.Scanner;

public class MinNumberWithScanner {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        System.out.println("Please enter first number:");
        int num1 = number.nextInt();
        System.out.println("Please enter second number:");
        int num2 = number.nextInt();

        boolean isMin1 = num1 < num2;
        boolean isMin2 = num2 < num1;
        boolean equality = num1 == num2;

        if (isMin1){
            System.out.println(num1 + " is minumum number.");
        }
        if (isMin2){
            System.out.println(num2 + " is minumum number.");
        }
        if (equality){
            System.out.println(num1 + " and " + num2 + " is equal.");
        }
    }
}
