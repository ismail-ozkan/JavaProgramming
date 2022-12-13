package day10_NestedIf;

public class TernariesIntro {

    public static void main(String[] args) {

        int n = 100;

        if(n%2==0){
            System.out.println("Even"); //String
        }else {
            System.out.println("Odd"); //String so if and else statement are same data type, then we use ternaries
        }

        System.out.println("-------------------");


        String result1 = (n%2==0)? "Even" : "Odd";

        System.out.println(result1);

         // ternaries dont use {} because of that only one value is returned

        System.out.println("-------------------");

        int age = 23;
        /*
        if (age >= 21) {
            System.out.println("Eligible"); // String
        }else {
            System.out.println("Not Eligible"); // String
        }
        */
        System.out.println("-------------------");


        //System.out.println( (age >=21)? "ELigible" : "Not ELigible");
        String result2 = (age >=21)? "ELigible" : "Not ELigible";

        System.out.println(result2);

        System.out.println("------------------------------");


        int number = 100;
        /*
        if (number > 0){
            System.out.println("Positive");
        } else if (number< 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
        */

        String isWhat = (number > 0)? "Positive" :(number< 0)? "Negative" : "Zero";
        /* for same thing we can use
         String isWhat = (number > 0)? "Positive"
                :(number< 0)? "Negative"
                : "Zero";
         */
        System.out.println(isWhat);


// String result111 = (Condition1)? "Statement(String or any variable" : (Condition2)? "Other Statemnt" : "Other 2. Statemnt";

    }

}
