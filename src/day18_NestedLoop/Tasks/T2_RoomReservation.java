package day18_NestedLoop.Tasks;

import java.util.Scanner;

public class T2_RoomReservation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int roomPrice = 0;
        int totalPrice = 0;
        String room ="";
        while(true) {

            System.out.println("Which bedroom do you want to reserve ?\n" +
                    "King Bed ==> 120$\n" +
                    "Queen Bed ==> 100$\n" +
                    "Single Bed ==> 80$");
            room = scan.nextLine();

            System.out.println("How many nights will you stay?");
            int night = scan.nextInt();
            switch (room) {
                case "King Bed":
                    roomPrice = 120;
                    break;
                case "Queen Bed":
                    roomPrice = 100;
                    break;
                case "Single Bed":
                    roomPrice = 80;
                    break;
            }
            totalPrice+= roomPrice*night;

            System.out.println("Would you like to reserve another room?");
            String yesNo = scan.next().toLowerCase();
            while (!(yesNo.equals("no") || yesNo.equals("yes"))) {
                System.err.println("Invalid entry, Please re-enter!");
                System.out.println("Would you like to reserve another room?");
                yesNo = scan.next().toLowerCase();
            }
            if (yesNo.equals("no")) {
                System.out.println("Total Price = " + totalPrice);
                break;
            }
            scan.nextLine();
        }

        scan.close();
    }

}
