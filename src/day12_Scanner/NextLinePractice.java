package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        input.nextLine();

        System.out.println("Enter your ful name: ");
        String name = input.nextLine();


        System.out.println("Enter your GPA: ");
        double gpa = input.nextDouble();

        input.nextLine();

        System.out.println("Enter your school: ");
        String schoolName = input.nextLine();

        System.out.println("Enter your class: ");
        String className = input.nextLine();


        System.out.println("age = " + age);
        System.out.println("name = " + name);
        System.out.println("gpa = " + gpa);
        System.out.println("schoolName = " + schoolName);
        System.out.println("className = " + className);


        input.close();

    }
}
