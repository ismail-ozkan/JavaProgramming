package day18_NestedLoop;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number:");
            int num = scan.nextInt();

            if (num%2==0) System.out.println("Even number");
            else System.out.println("Odd Number");

            System.out.println("Would you like to enter another number?");
            String yesNo = scan.next().toLowerCase();

            while (!(yesNo.equals("yes") || yesNo.equals("no"))) {
                System.err.println("Invalid answer! Would you like to enter another number?");
                yesNo = scan.next();
            }

            if (yesNo.equals("no")) break;
        }
        /*
        System.out.println("Enter a number:");
        int num = scan.nextInt();

        if (num%2==0) System.out.println("Even number");
        else System.out.println("Odd Number");

        System.out.println("Would you like to enter another number?");
        String yesNo = scan.next();

        while (true){

            System.out.println("Would you like to enter another number?");
            String yesNo = scan.next();
            while (!(yesNo.equals("yes") || yesNo.equals("no"))) {
                System.err.println("Invalid answer! Would you like to enter another number?");
                yesNo = scan.next();
            }

            if (yesNo.equals("no")) {
                break;
            }

            System.out.println("Enter a number:");
            num = scan.nextInt();
            if (num%2==0) System.out.println("Even number");
            else System.out.println("Odd Number");

        }
*/
        scan.close();
    }

}
