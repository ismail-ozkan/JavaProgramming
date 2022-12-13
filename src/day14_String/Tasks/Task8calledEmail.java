package day14_String.Tasks;

import java.util.Scanner;

public class Task8calledEmail {

    public static void main(String[] args) {

        System.out.println("Enter your email address: ");
        String email = new Scanner(System.in).nextLine();
        String firstName = email.substring(0,email.indexOf("_"));
        String lastName = email.substring(email.indexOf("_")+1,email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1,email.lastIndexOf("."));

        firstName = firstName.toUpperCase().charAt(0)+firstName.substring(1);
        lastName = lastName.toUpperCase().charAt(0)+lastName.substring(1);
        //String a = (firstName.charAt(0)+"").toUpperCase();
        System.out.println("First name : "+firstName);
        System.out.println("Last name : "+lastName);
        System.out.println("Domain = " + domain);

    }

}
