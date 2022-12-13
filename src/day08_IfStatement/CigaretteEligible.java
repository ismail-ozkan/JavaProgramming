package day08_IfStatement;

public class CigaretteEligible {

    public static void main (String[] args){

        byte age = 22;

        boolean isEligibleCigarrette = age >= 18;

        if (isEligibleCigarrette){
            System.out.println(age + " is eligible to cigarette");
        } else {
            System.out.println(age + " is NOT eligible to cigarette");
        }




    }
}
//1. Given a number (byte) age, write a program that can check if the person is eligible to buy Cigarettes