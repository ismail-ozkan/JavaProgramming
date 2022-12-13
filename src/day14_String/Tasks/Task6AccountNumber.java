package day14_String.Tasks;

import java.util.Scanner;

public class Task6AccountNumber {
/*
6. Create a class called AccountNumber.
       Ask the user enter an account number (String). Check if these account number is valid.
            > If the account number begins with a “2” the account number should be 7 characters long
            > If the account number begins with a “5” the account number should be 10 characters long
            —> If the account number does not begin with a 2 or a 5 OR the account number lengths
                    do not meet the expected results print “Invalid account number”
 */
    public static void main(String[] args) {

        System.out.println("Enter account number: ");
        String accountNumber = new Scanner(System.in).nextLine();

        if (accountNumber.charAt(0)=='2' && accountNumber.length()==7) {
            System.out.println("Account number is valid");
        } else if (accountNumber.charAt(0)=='5' && accountNumber.length()==10) {
            System.out.println("Account number is valid");
        } else {
            System.out.println("Invalid account number");
        }


    }

}
