package day12_Scanner.Practices;

import java.util.Scanner;

public class StockMarket {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many total shares are you have already: ");
        int shares = input.nextInt();


        if (shares>0) {
            System.out.println("How much your total value in the stock market: ");
            double totalValue = input.nextDouble();

            input.nextLine();

            System.out.println("Enter the name of the company you have the most shares in: ");
            String company = input.nextLine();

            System.out.println("Your total stock market holding is $"+totalValue+" which is made up of "+shares+" shares. "+company+" is your company holdings");
        }







    }
}
