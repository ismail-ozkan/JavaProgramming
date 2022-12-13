package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");//...Enter
        String fullName = input.nextLine();

        System.out.println("Enter your programming language: ");//...Enter
        String programming = input.nextLine();

        System.out.println("Enter your age: ");//24         Enter( is ignored)
        int age = input.nextInt();

        input.nextLine();//Enter ----> additional
                        // capture the Enter key that user pressed for nextInt()

        System.out.println("Enter your school name: ");
        String school = input.nextLine();
        
        
        
        
        System.out.println("fullName = " + fullName);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("school = " + school);


        input.close();

    }

}
