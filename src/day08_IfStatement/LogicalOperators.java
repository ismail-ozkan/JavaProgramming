package day08_IfStatement;

public class LogicalOperators {

    public static void main(String[] args) {

        String name = "Steven";
        int age = 13;
        String citizen = "USA";

        //   && Logical AND -----> both
        boolean isEligible = age >= 18 && citizen == "USA";
        //                   13 >= 18 && citizen == "USA";//false
        //                   19 >= 18 && citizen == "UK"; // false


        System.out.println(name + " is eligible to vote: " + isEligible);

        System.out.println("------------------------------");
        System.out.println("------------------------------");

        // apply for a loan
        String name2 = "Josh";
        int creditScore = 720;
        int age2 = 23;
        int income = 40000;

        boolean isEligibleForLoan = creditScore >= 700 && age2 >= 21 && income >= 60000;


        System.out.println(name2 + " is eligible for loan: " + isEligibleForLoan);

        System.out.println("-------------------------------------");

        //   || Logical OR Operator ------> either

        String name3 = "Shay";
        int age3 = 21;
        char gender = 'F';

        boolean isEligible3 = age3 >= 18 && (gender == 'M' || gender =='F');
                            // 21 >= 18 && (  'F' == 'M'  ||   'F'  == 'F')
                            // true     && (    false     ||    true)
                            // true &&         ( true )
                            // true is result

        System.out.println(name3 + " is eligible to register: " + isEligible3);

        System.out.println("------------------------------");
        // become a US citizen

        String name4 = "James";
        String countryOfBirth = "UK";
        boolean marriedToUSCitizen = false;

        boolean eligible4 = countryOfBirth == "USA" || marriedToUSCitizen == true;
        //                          false           ||        false     ------------>> false
        //                          false           ||        true     ------------>> true
        //                          true           ||        true      ------------>> true
        //          USA == USA ---> true           ||        false     ------------>> true

        System.out.println(name4 + " is eligible to apply for US citizenship: " + eligible4);

        System.out.println("------------------------------");
        // eligible for Scholarship
        String name5 = "Anna";

        double gpa = 3.5;
        int familyIncome = 100000;

        boolean isEligible5 = gpa >= 3.5 || familyIncome <= 60000;

        System.out.println(name5 + " is eligible for scholarship: " + isEligible5);

        System.out.println("----------------------------");

        boolean result2 = true;

        boolean result3 = !result2;
              //   false   true
        System.out.println("result3 = " + result3);

        System.out.println("----------------------------");

        int score = 85;
        boolean passed = score >= 60;
        boolean failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);


    }

}
