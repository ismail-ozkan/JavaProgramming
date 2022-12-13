package day08_IfStatement;

public class GradeReport {

    public static void main(String[] args) {
/*
        System.out.println(true == !false);// true
        System.out.println(!true != false);// false
        System.out.println(!false == true); // true

        System.out.println(!!false); // false
        System.out.println(!!!true); // false !true == !!!true
*/
        int score = 85;
/*  boolean a = score >= 90 || score <= 100;
        //              false   ||  true     ----> true
      */
        boolean a = score >= 90 && score <= 100;
        //              false   &&  true    -----> false
        boolean b = score >= 80 && score <= 89;
        //boolean b = score >= 80 && !a; // second way
        //              true   &&  true    -----> true
        boolean c = score >= 70 && score <= 79;
        //second way = !a && !b && score >= 70;
        //              false   &&  false    -----> false
        boolean d = score >= 60 && score <= 69;
        //second way = !a && !b && !c && score >= 60;

        boolean f = score >= 60 && score <= 69;
     // boolean f = !a && !b && !c && !d


        if (a) { // if the student made A
            System.out.println("Excellent");
        }

        if (b) { // if the student made B
            System.out.println("Great");
        }
        if (c) {// if the student made C
            System.out.println("Good");
        }
        if (d) { // if the student made D
            System.out.println("Passed");
        }
        if (f) { // if the student made F
            System.out.println("Failed");
        }

    }
}
/*
    90 ~ 100 ==> Excellent
    80 ~ 89 ==> Great
    70 ~ 79 ==> Good
    69 ~ 69 ==> Passed
    0 ~ 559 ==> Failed




 */