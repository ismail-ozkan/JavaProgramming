package day23_CustomMethods_Void.Tasks;

import java.io.StringReader;

public class T4 {

    public static void main(String[] args) {

        int age = 19;
        String country = "USA";

        eligibleVote(age, country);
    }

    public static void eligibleVote(int age, String country) {

        if (age>=20&&country.equals("USA")) {
            System.out.println("You are eligible to vote!");
        } else {
            System.out.println("You are not eligible to vote!");
        }


    }

}
/*
4. create a method that can check if a person is eligible to vote
			Ex:
				eligibleToVote(19, "USA");

			output:
				You are not eligible to vote!
 */