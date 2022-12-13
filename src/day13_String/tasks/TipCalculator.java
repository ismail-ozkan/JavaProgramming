package day13_String.tasks;

import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Split or No split (Yes or No)?");
        String spilit = scan.nextLine().toLowerCase();

        System.out.println("Enter the number of people:");
        double numberOfPeople = scan.nextDouble();

        System.out.println("Enter the check amount: ");
        double amount = scan.nextDouble();

        scan.nextLine();

        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        String sevriceQuality = scan.nextLine();
        double quality = 0;
        if (sevriceQuality.equals("Poor")) {
            quality = 0.05;
        } else if (sevriceQuality.equals("Fair")){
            quality = 0.1;
        } else if (sevriceQuality.equals("Good")) {
            quality = 0.15;
        } else if (sevriceQuality.equals("Great")) {
            quality = 0.2;
        } else if (sevriceQuality.equals("Excellent")) {
            quality = 0.25;
        } else {
            System.out.println("Invalid quality");
        }

        double totalToPay = (amount*(1+quality));
        double totalTip = amount*quality;
        double totalPerPerson =  totalToPay / numberOfPeople;
        double tipPerPerson = totalTip / numberOfPeople;


        System.out.println("Number of people entered: "+ numberOfPeople);
        System.out.println("Total to pay: "+ totalToPay);
        System.out.println("Total tip: "+ totalTip);
        if (spilit.equals("yes")) {
            System.out.println("Total per person: "+totalPerPerson);
            System.out.println("Tip per person: "+tipPerPerson);
        }

    }
}
/*
. Create a class called TipCalculator, write a program for a tip calculator.
There will be different service quality benchmarks that will determine the tip given. 
There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

		Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

	The program should display the following information based on the user input:

	Split or No split (Yes or No),  Number of people entered: (number) (each person = & in output) Check amount: (number) Service Quality: (String) Total to pay: Total tip: Total per person: Tip per person:

	Ex:
		Split or No split (Yes or No)?
		Yes
		Enter the number of people
		4
		Enter the check amount:
		476
		How was the srvice quality? (Excellent/Great/Good/Fair/Poor)
		Excellent

		output:
			Number of people entered: 4
			Total to pay: 595.0
			Total tip: 119.0
			Total per person: 148.75
			Tip per person: 29.75

	HINT: you will need to use .equals() method

 */