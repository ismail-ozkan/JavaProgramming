package day20_Arrays;

import java.util.Scanner;

public class MonthsArray {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of the month");
        int num = scan.nextInt();

        String[] months = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};

        while (true) {
            if (num<1 || num>12) {
                System.out.println("Invalid number, re-enter please");
            } else break;
            System.out.println("Enter the number of the month");
            num = scan.nextInt();
        }

        System.out.println(months[num-1]);

        System.out.println("-----------------------------------------");
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
            if (i==num-1) System.exit(0);
        }



    }

}
