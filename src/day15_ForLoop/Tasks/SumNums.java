package day15_ForLoop.Tasks;

import java.util.Scanner;

public class SumNums {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number for sum of all number from 0 to the number: ");
        int num = scan.nextInt();
        int sum = 0;

        for (int i = 1; i <=num; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
