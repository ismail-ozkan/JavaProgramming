package day12_Scanner.Practices;

import java.util.Scanner;

public class PlaceAnOrder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the prodcut name: ");
        String name = input.nextLine();

        System.out.println("Enter the price: ");
        double price = input.nextDouble();

        System.out.println("Enter the quantity: ");
        int quantity = input.nextInt();

        System.out.println("Enter your first name: ");
        String firstName = input.next();

        System.out.println(firstName+", your order for "+quantity+" "+name+" has been places. Your total is "
        + (quantity*price));

    }
}
