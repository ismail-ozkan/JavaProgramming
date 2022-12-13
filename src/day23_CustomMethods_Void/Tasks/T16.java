package day23_CustomMethods_Void.Tasks;

import java.util.Locale;

public class T16 {
/*
16.  write a method that can print out the full name of a person in regular format
            ex:
               fullName("cYdEo", "SCHOOL");

                output:
                    "Cydeo School"
 */
    public static void main(String[] args) {

        regularFormat("isMAiL", "özKAn");

    }

    public static void regularFormat(String firstName, String lastName) {

        firstName = (""+firstName.charAt(0)).toUpperCase(Locale.ROOT)+firstName.toLowerCase().substring(1);
        lastName = (""+lastName.charAt(0)).toUpperCase(Locale.ROOT)+lastName.toLowerCase().substring(1);
        String fullName = firstName+" "+lastName;

        System.out.println(fullName);
    }

}
