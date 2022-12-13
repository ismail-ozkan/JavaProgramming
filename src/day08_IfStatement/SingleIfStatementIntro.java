package day08_IfStatement;

public class SingleIfStatementIntro {

    public static void main(String[] args) {

        int number = 301;

 /*System.out.println("Even Number");

   System.out.println("Odd Number");*/
        boolean evenNumber = number % 2 == 0;
        boolean oddNumber = !evenNumber;// or number % 2 == 1; // or number %2 != 0;

        if (evenNumber){// condition in the if condition is true, then the statement get executed
            System.out.println(number + " is even number");
        }

        if (oddNumber){// or (!evenNumber) or number % 2 == 1 or number %2 != 0
            System.out.println(number + " is odd number");
        }
        // instead of this if statement we can create new boolean

        System.out.println("-------------------------------");

        int n = 200;

        // positive
        if (n > 0){ // if the n is greater than 0, then it is positive
            System.out.println(n + " is  positive");
        }

        // negative
        if (n < 0){// if the n is less than 0, then it is negative
            System.out.println(n + " is  negative");
        }

        // zero
        if (n == 0){
            System.out.println(n + " is  zero");
        }


    }
}
