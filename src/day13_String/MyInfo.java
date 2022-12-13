package day13_String;

import day04_Variables.SalaryCalculator;

import java.util.Scanner;

public class MyInfo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("1. Enter your age");
        int age = scan.nextInt();

        System.out.println("2. Enter your gender");
        String gender = scan.next();

        scan.nextLine();

        System.out.println("3. Enter your full name");
        String fullName = scan.nextLine();

        System.out.println("4. Enter your phone number");
        long phoneNum = scan.nextLong();

        System.out.println("5. Enter your zip code");
        int zipCode = scan.nextInt();

        scan.nextLine();

        System.out.println("6. Enter your School name");
        String schoolName = scan.nextLine();

        System.out.println("7. Enter your city name");
        String cityName = scan.nextLine();

        System.out.println("8. Enter your state name");
        String stateName = scan.next();

        System.out.println("9. Enter your building number");
        int buildingNumber = scan.nextInt();

        scan.nextLine();

        System.out.println("10. Enter your Street name");
        String streetName = scan.nextLine();


        scan.close();

        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Phone Num: " + phoneNum);
        System.out.println("Address:\n" +
                "\t"+buildingNumber+" "+streetName+"\n"+
                "\t"+cityName+", "+zipCode);
        System.out.println("schoolName: " + schoolName);

    }

}
/*
warmup tasks:
	1. Create a class called MyInfo. Write a program that can ask the user to:
			1. Enter your age (int)
			2. Enter your gender (String- One word ONLY)
			3. Enter your full name (String- Multiple words)
			4. Enter your phone number (long)
			5. Enter your zip code (int)
			6. Enter your School name (String- Can be Multiple words)
			7. Enter your city name (String- Can be Multiple words)
			8. Enter your state name (String- One word ONLY)
			9. Enter your building number (int)
			10. Enter your Street name

		MAKE SURE USER CAN ENTER ALL THE INPUT

		Display all the inputs that user entered in following order in sperate lines:

			1. full name
			2. age
			3. gender
			4. phone number
			5. address:
						buildingNumber Street
						City, State ZipCode

			6. school name
 */