package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        System.out.println("Enter true or false:");
        // 0 == 0 is NOT perceived by compalier as a true !!!
//        boolean result = input.nextBoolean();

        System.out.println("Enter Your Name:");// ismail özkan

        String name = input.next();

        System.out.println("name = " + name);// ismail
        // next() method is used for only 1 word. space is finish point


        input.close();
    }

}
