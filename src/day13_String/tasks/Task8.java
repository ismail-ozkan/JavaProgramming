package day13_String.tasks;

import java.util.Scanner;

/*
8. You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials. If credentials are matched, your program should print "Logged in."
        otherwise print "Incorrect username or password" as error message

    	Hints: 	In order to login, both username and password MUST be correct
    			you will need to use equals() method

 */
public class Task8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String username = "Cydeo";
        String password = "WoodenSpoon";


        System.out.println("Enter Username please:");
        String inUserName = input.next();


        System.out.println("Enter Password please:");
        String inUserPassword = input.next();

        boolean check1 = username.equals(inUserName);
        boolean check2 = password.equals(inUserPassword);
/*
        if (check1&&check2) {
            System.out.println("Logged in.");
        } else {
            System.out.println("Incorrect username or password");
        }
*/
        System.out.println((check1&&check2)? "Logged in." : "Incorrect username or password");

        input.close();


    }

}
