package MySelf;

import java.util.*;
import java.util.Scanner;

public class StudentsInfo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfStudent = 2;
        String[][] students = new String[numberOfStudent][];
        for (int i = 0; i < numberOfStudent; i++) {
            students[i] = students(scan);
        }
        System.out.println(Arrays.deepToString(students));

    }
    //create a method for gather the all info about student in one array
    public static String[] students(Scanner student) {
        String[] studentInfo = new String[2];
        student = new Scanner(System.in);
        System.out.println("Enter student's name: ");
        String name = student.nextLine();
        System.out.println("Enter student's last name: ");
        String lastName = student.nextLine();

        studentInfo[0] = name.toUpperCase().charAt(0)+name.substring(1).toLowerCase();
        studentInfo[1] = lastName.toUpperCase().charAt(0)+lastName.substring(1).toLowerCase();

        return studentInfo;
    }


}
