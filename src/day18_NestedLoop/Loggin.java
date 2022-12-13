package day18_NestedLoop;

import java.util.Scanner;

public class Loggin {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String username= "Cydeo";
        String password= "WoodenSpoon";

        System.out.println("Enter user name");
        String user = scan.next();
        System.out.println("Enter password");
        String pass= scan.next();

        if (user.equals(username)&& pass.equals(password)) {
            System.out.println("Logged in.");
        } else {
            for (int i = 0; i < 3; i++) {
                System.err.println("Incorrect username or password");
                System.out.println("Enter user name");
                user = scan.next();
                System.out.println("Enter password");
                pass = scan.next();

                if (user.equals(username) && pass.equals(password)) {
                    System.out.println("Logged in.");
                    break;
                    }
            }
            if (!(user.equals(username) && pass.equals(password))) {
                System.err.println("Your account is locked.");
            }

        }
    }

}
/*
2. You are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                            username: Cydeo
                            password: WoodenSpoon

                Ask the user to enter their credentials.
                        If credentials are matched, your program should print "Logged in."
                        If the credentials are not matched, the program should allow the user to have
                        three attempts to enter correct credentials and if all three attempts are failed,
                        then print "Your account is locked."
 */