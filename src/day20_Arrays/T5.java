package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class T5 {
/*
5. Items
			1. Create an array named items with the length of 5
			2. Create an array named prices with the length of 5
			3. Ask user to enter item name and price 5 times and store them into the items and prices arrays
			4. calculate the total price of the arrays
			5. display each item name and price in separate lines

						ItemName -- Price
 */
    public static void main(String[] args) {

        String[] items = new String[5];
        int[] prices = new int[5];
        int totalPrice = 0;
        Scanner scan = new Scanner(System.in);


        for (int i = 0; i < items.length; i++) {
            System.out.println("Enter a item name: ");
            items[i] = scan.next();
            System.out.println("Enter price of item: ");
            prices[i] = scan.nextInt();
            totalPrice+=prices[i];
        }

        System.out.println("totalPrice = " + totalPrice);
        System.out.println(Arrays.toString(items));
        System.out.println(Arrays.toString(prices));

    }

}
