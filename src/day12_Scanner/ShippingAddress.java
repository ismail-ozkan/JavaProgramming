package day12_Scanner;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your ful name: ");
        String fullName = input.nextLine();

        System.out.println("Enter your building number: ");
        String buildingNum = input.next();

        input.nextLine();

        System.out.println("Enter your street name: ");
        String streetName = input.nextLine();

        System.out.println("Enter your city name: ");
        String cityName = input.nextLine();

        System.out.println("Enter your State name: ");
        String stateName = input.next();

        System.out.println("Enter your Zip code: ");
        String zipCode = input.next();

        input.nextLine();

        System.out.println("Enter your country name: ");
        String countryName = input.nextLine();

        System.out.println(fullName+"\n"+buildingNum+" "+streetName+"\n"+cityName+", "+stateName+" "+zipCode+"\n"+countryName);

        input.close();
    }

}
