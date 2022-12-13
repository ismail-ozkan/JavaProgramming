package day27_WrappeClasses;

public class PasswordValidation {

    public static void main(String[] args) {
        
        String password = "Cydeo2143!";
        String result = "";
        int Digit = 0;
        int UpperLetter = 0;
        int LowerLetter = 0;
        int SpecialChar = 0;
        
        char[] pass = password.toCharArray();
        for (char each : pass) {
            if (Character.isDigit(each)){
                Digit++;
            } else if (Character.isUpperCase(each)) { 
                UpperLetter++;
            } else if (Character.isLowerCase(each)) {
                LowerLetter++;
            } else {// !Character.isLetterOrDigit
                SpecialChar++;
            }
        }

        if (password.length() < 8 || password.contains(" ")) {
            result = "Not enough strong password";
        } else if (Digit < 1) {
            result = "Not enough strong password";
        } else if (UpperLetter < 1) {
            result = "Not enough strong password";
        } else if (LowerLetter < 1) {
            result = "Not enough strong password";
        } else if (SpecialChar < 1) {
            result = "Not enough strong password";
        } else {// Character.isLetterOrDigit()
            result = "Enough strong password";
        }
        System.out.println(result);
    }
}
/*
Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
                1. Password MUST be at least have 8 characters long, and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lower case letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit
 */