package day15_ForLoop.Tasks;

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to calculate factorial of number");
        int num = scan.nextInt();
        int factorial = 1;

        for (int i=num; i>0; i--) {
            factorial *=i;
        }
        System.out.println("factorial = " + factorial);
    }

}
