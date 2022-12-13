package day17_While_DoWhile;

import java.util.Scanner;

public class LogIn_MySelf {

    public static void main(String[] args) {

        // username: "Cydeo"
        // password: "Cydeo123"


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter user name: ");
        String userName= scan.next();
        System.out.println("Enter password: ");
        String password= scan.next();
        int attempt = 1;

        while (attempt<=3&&!(userName.equals("Cydeo")&&password.equals("Cydeo123"))) {
            System.err.println("Your username or password is wrong");
            System.err.println("Remaining right of attempt: " + (4 - attempt));
            attempt++;
            System.err.println("Re-Enter user name: ");
            userName = scan.next();
            System.err.println("Re-Enter password: ");
            password = scan.next();
        }

        if (userName.equals("Cydeo")&&password.equals("Cydeo123")) {
            System.out.println("Logged in");
        } else {
            System.out.println("Account Locked");
        }

        scan.close();
        /*while (!(attempt<3 && (userName.equals("Cydeo")&&password.equals("Cydeo123")))) {
            System.out.println("Logged in");
        } else {
            System.err.println("Re-Enter, attempt right: "+enterance);
            System.err.println("Enter user name: ");
        }*/



        /*while ((enterance!=3)||!(userName.equals("Cydeo")&&password.equals("Cydeo123"))) {
            if (userName.equals("Cydeo")&&password.equals("Cydeo123")) {
                System.out.println("Logged in");
            } else {
                System.err.println("Re-Enter, attempt right: "+enterance);
                System.out.println("Enter user name: ");
                userName = scan.next();
                enterance++;
            }

        }*/


    }

}
