package day13_String.tasks;

import java.util.Scanner;

public class calledTravel {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Have you got a valid passport?(Yes or No): ");
        String yesNo =scan.nextLine().toLowerCase();

        if (yesNo.equals("yes")) {
            int baseCostOfTicket = 1000;
            System.out.println("How many bags do you take for travel?: ");
            byte bags = scan.nextByte();
            scan.nextLine();
            System.out.println("Which country do you travel to?: ");
            String countryName = scan.nextLine();
            baseCostOfTicket += (bags*50);
            System.out.println("How many people do you will travel with?: ");
            short withPeople = scan.nextShort();
            if (withPeople<=2) {
                baseCostOfTicket -= (withPeople*100);
            } else {
                baseCostOfTicket -= 300;
            }
            scan.nextLine();
            System.out.println("Enter the name of the people do you will travel with " +
                    "\nin one line, separating each name with a comma: ");
            String nameOfPeople = scan.nextLine();

            System.out.println("Your ticket is booked to "+countryName+". We have charged extra for the "+bags+
                    " bags but you are traveling with "+withPeople+
                    " so we are giving a discount. Your total cost is "+baseCostOfTicket);
        } else if (yesNo.equals("no")) {
            int costOfPassportRenewal = 200;
            System.out.println("When is your passport expired year?: ");
            int expiredYear = scan.nextInt();
            costOfPassportRenewal += (2022-expiredYear)*75;
            scan.nextLine();
            System.out.println("Which country do you travel to?: ");
            String countryName = scan.nextLine();
            System.out.println("Will you travel next year?(Yes or No): ");
            String nextYear = scan.nextLine().toLowerCase();
            if (nextYear.equals("yes")) {
                costOfPassportRenewal += 100;
            } else if (nextYear.equals("no")) {
                costOfPassportRenewal -= 50;
            }

            System.out.println("Looks like your password has been expired for "+(2022-expiredYear)+
                    ", but not to worry we will get it ready for you to travel to "+countryName+
                    ". Your total cost has come out to "+costOfPassportRenewal+".");
        } else {
            System.out.println("Please enter Yes or No!!!");
        }

        scan.close();
    }

}
