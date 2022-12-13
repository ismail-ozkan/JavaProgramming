package Day19_LoopPractices.Tasks;

import java.util.Scanner;

public class T2 {
    /*
    2. Write a program that can calculate the area and perimeter of a Square:
			1. Ask the user "Enter the side of the square:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the side of the square"

			2. Display:
					1. Area of square
					2. Perimeter of square

			3. Ask the user "Would you like to calculate another Square?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Square Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double side = 0;
        String yesNo="";
        while(true) {
            System.out.println("Enter the side of the square:");
            side = scan.nextDouble();
            if (side<=0) {
                System.err.println("Invalid Entry for the side of the square");
                System.exit(0);
            }
            System.out.println("1. Area of square:"+(side*side)+"\n" +
                    "2. Perimeter of square: "+(4*side));

            while (true){
                System.out.println("Would you like to calculate another Square?");
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
