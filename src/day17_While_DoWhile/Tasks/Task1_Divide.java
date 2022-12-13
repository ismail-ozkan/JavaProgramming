package day17_While_DoWhile.Tasks;
/*
1. Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.
 */
public class Task1_Divide {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 35;
        int division1 = 0;
        int division2 = 0;

        // num1 / num2
        if (num1>num2) {
            do {
                division1++;
                num1-=num2;
            }while (num1>=num2);
        } else if (num2>num1) {
            do {
                division2++;
                num2-=num1;
            }while (num2>=num1);
        } else {
            System.out.println("num2 / num1 = 1");
        }

        if (division1>0) {
            System.out.println("num1 / num2 = " + division1);
        } else if (division2>0) {
            System.out.println("num2 / num1 = " + division2);
        }

    }

}
