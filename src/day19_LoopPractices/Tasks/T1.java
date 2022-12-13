package Day19_LoopPractices.Tasks;

import java.util.Scanner;

public class T1 {
/*
1. Write a program that can calculate the area and perimeter of a circle:
			1. Ask the user "Enter the radius of the circle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the radius of the circle"

			2. Display:
					1. Diameter of circle
					2. Area of circle
					3. Perimeter of circle

			3. Ask the user "Would you like to calculate another circle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry
 */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double radius = 0;
        String yesNo="";
        while(true) {
            System.out.println("Enter the radius of the circle:");
            radius = scan.nextDouble();
            if (radius<=0) {
                System.err.println("Invalid Entry for the radius of the circle");
                System.exit(0);
            }
            System.out.println("1. Diameter of circle: "+(2*radius)+"\n" +
                    "2. Area of circle: "+(3.14*radius*radius)+"\n" +
                    "3. Perimeter of circle: "+(2*3.14*radius));
            while (true){
                System.out.println("Would you like to calculate another circle?");
                yesNo = scan.next().toLowerCase();

                if (yesNo.equals("no")) {
                    System.out.println("Thank you for using Cydeo Circle Calculator APP");
                    System.exit(0);
                }
                if (yesNo.equals("yes")) break;

                System.err.println("Invalid entry, please re-enter");
            }
        }


    }

}
