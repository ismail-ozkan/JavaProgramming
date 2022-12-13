package day17_While_DoWhile.Tasks;

import java.util.Scanner;

public class Task6_InsuranceQuote {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Enter your gender: ");
        String gender = scan.next();
        while (!(gender.toLowerCase().equals("male") || gender.toLowerCase().equals("female"))) {
            System.err.println("Invalid entry!");
            System.out.println("Re-enter your gender: ");
            gender = scan.next();
        }
        System.out.println("Are you married: ");
        String isMarried = scan.next();
        while (!(isMarried.toLowerCase().equals("yes") || isMarried.toLowerCase().equals("no"))) {
            System.err.println("Invalid entry!");
            System.out.println("Re-enter are you married: ");
            isMarried = scan.next();
        }
        System.out.println("Enter your age: ");
        int age = scan.nextInt();
        while (!(age>0||age<=120)) {
            System.err.println("Invalid entry!");
            System.out.println("Re-enter your age: ");
            age = scan.nextInt();
        }
        System.out.println("How many miles do you drive in a day: ");
        int miles = scan.nextInt();
        while (!(miles<5)) {
            System.err.println("Invalid entry!");
            System.out.println("Re-enter how many miles do you drive in a day: ");
            miles = scan.nextInt();
        }
        System.out.println("Do you want full coverage or liability insurance:(Yes/No) ");
        String fullCoverage = scan.next();
        while (!(fullCoverage.toLowerCase().equals("yes") || fullCoverage.toLowerCase().equals("no"))) {
            System.err.println("Invalid entry!");
            System.out.println("Re-enter Do you want full coverage or liability insurance:(Yes/No)");
            fullCoverage = scan.next();
        }
        System.out.println("Did you had any accidents or claims in past 5 years (Yes/No)");
        String accident = scan.next();
        while (!(accident.toLowerCase().equals("yes") || accident.toLowerCase().equals("no"))) {
            System.err.println("Invalid entry!");
            System.out.println("Re-enter Did you had any accidents or claims in past 5 years (Yes/No)");
            accident = scan.next();
        }
        System.out.println("Has your car an anti-theft device (Yes/No)");
        String antiTheft = scan.next();
        while (!(antiTheft.toLowerCase().equals("yes") || antiTheft.toLowerCase().equals("no"))) {
            System.err.println("Invalid entry!");
            System.out.println("Re-enter Has your car an anti-theft device (Yes/No)");
            antiTheft = scan.next();
        }

        double  priceOfInsurance = 0.0;

        if (fullCoverage.equals("no")) {// for liability
            priceOfInsurance = (age<25)? 90: 50;
            priceOfInsurance += (miles<=10)? 10 :(miles>10&&miles<50)? 30: 50;
        } else { // fro full coverage
            priceOfInsurance = (age<25)? 160: 120;
            priceOfInsurance += (miles<=10)? 20 :(miles>10&&miles<50)? 40: 70;
        }

        priceOfInsurance*= (antiTheft.equals("yes"))? 0.95: 1;
        priceOfInsurance*= (accident.equals("yes"))? 1.15: 0.9;
        priceOfInsurance*= (isMarried.equals("yes"))? 0.95: 1;

        System.out.println(priceOfInsurance);
    }
}
/*
6. Create a class called InsuranceQuote, write a program that can calculate the insurance cost of a person based on the following info:
    		1. Ask the user to enter your name
    		2. Ask the user to enter your gender
    			(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			3. Ask the user if he/she is married(Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			4. Ask user to enter your age
					(age can not be negative or greater than 120)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			5. Ask user to enter how many miles he/she drives in a day
					(mileage can not be negative or less than 5)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			6. Ask the user if he/she wants full coverage or liability insurance?

			7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

			8. Ask the user if his/her car has an anti-theft device (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

		Calculate the price of the insurance and display all the info of the user

			Insurance Quote calculation:
				starting prices for liability:
					age < 25 ===> 90
					age >= 25 ==> 50

					miles <= 10 ====> $10
				    miles > 10 and miles <= 50 ==> $30
				    miles > 50 ===>  $50

				starting prices for full coverage:
					age < 25 ===> 160
					age >= 25 ==> 120

					miles <= 10 ====> $20
				    miles > 10 and miles <= 50 ==> $40
				    miles > 50 ===>  $70

			    If the car has anti-theft device ==> 5% discount
			    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
			    If he/she never had any accidents or claims in past 5 years ==> 10% discount
			    If he/she is married ==> 5% discount
 */