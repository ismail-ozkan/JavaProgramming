package day17_While_DoWhile.Tasks;

import java.util.Scanner;

public class Task5_RommReservation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to reservee a room: (Yes/No)");
        String yesNo = scan.next().toLowerCase();

        while (!(yesNo.equals("yes")||yesNo.equals("no"))) {
            System.out.println("Do you want to reservee a room? Re-enter valid answer: (Yes/No)");
            yesNo = scan.next().toLowerCase();
        }
        scan.nextLine();
        String roomType = "";
        if (yesNo.equals("yes")) {
            System.out.println("Which type of room do you want: ");
            roomType = scan.nextLine();
            while (!(roomType.equals("King Bed")||roomType.equals("Queen Bed")||roomType.equals("Single Bed"))){
                System.out.println("Which type of room do you want? Reselect please: ");
                roomType = scan.nextLine();
            }
        } else {
            System.out.println("Have a nice day");
        }
        int price = 0;
        if (roomType.equals("King Bed")) {
            price = 120;
        } else if (roomType.equals("Queen Bed")) {
            price = 100;
        } else {
            price = 80;
        }
        System.out.println(roomType+" is reserved and total price is $"+price);
    }
}
/*
5. Create a class called RommReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)

 */