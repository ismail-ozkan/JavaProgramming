package day16_ForLoopStringPractice.Tasks;

import java.util.Scanner;

public class Task3_MultiplyWithoutMultiplication {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int sum = 0;

        if (num1<0 || num2<0) {
            System.out.println("Invalid");
        } else {
            for (int i = 1; i <= num2; i++) {
                sum+=num1; // sum 20
            }
            System.out.println(sum);
        }

        ;
    }

}
