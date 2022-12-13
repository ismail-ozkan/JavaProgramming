package day23_CustomMethods_Void.Tasks;

import java.util.Scanner;

public class T3 {

    public static void main(String[] args) {

        System.out.println("What is your age?");
        int age = new Scanner(System.in).nextInt();

        eligibleAlcohol(age);

    }

    public static void eligibleAlcohol(int age) {

        if (age>=20) System.out.println("Your age is eligible for alcohol");
        else System.out.println("Your age is NOT eligible for alcohol");
    }

}
