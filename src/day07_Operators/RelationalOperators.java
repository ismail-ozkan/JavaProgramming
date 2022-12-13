package day07_Operators;

public class RelationalOperators {

    public static void main(String[] args) {

        // >, >=, <, <=

        boolean result1 = 20 > 40; // false
        System.out.println("result1 = " + result1);

        boolean result2 = 200 > 40; // true
        System.out.println("result2 = " + result2);

        boolean result3 = 300 >= 150; // true
        System.out.println("result3 = " + result3);

        boolean result4 = 100 >= 100; // true
        System.out.println("result4 = " + result4);

        boolean result5 = 200 >= 220; // false
        System.out.println("result5 = " + result5);


        // credit score of 720
        int creditScore = 745;

        boolean isEligibleForLoan = creditScore >= 720; // if the credit score is 720 or greater,
        // then it's eligible for loan
        System.out.println("isEligibleForLoan = " + isEligibleForLoan);

        boolean result6 = 20 < 140; // true
        System.out.println("result6 = " + result6);

        boolean result7 = 200 < 140; // false //// there is only one condition that need to be control

        int score = 59;
        boolean hasFailed = score <= 59;    // there are two condition that need to be control
                            // 59 <= 59
        System.out.println("hasFailed = " + hasFailed);

        System.out.println("--------------------------");

        // single "=" operator is reserved by Java for assignment

        int x = 100;
        int y = 200;
        boolean equal = x == y; // false
                    //100 == 200
        System.out.println("equal = " + equal);

        boolean result8 = "Muhtar" == "Bad Guy";// false
        System.out.println("result8 = " + result8);

        boolean result9 = 'A' == 'a';// false ASCI table comparison
        System.out.println("result9 = " + result9);

        boolean result10 = "Java   " == " Java    ";//false
        System.out.println("result10 = " + result10);



        System.out.println("------------------------------");

        // "Hello World" == "hello world" ===> false

        boolean result11 = 100 != 200.5 ;// true because they are not-equal(!=)
        System.out.println("result11 = " + result11);

        boolean result12 = "Java" != "Break"; // true
        System.out.println("result12 = " + result12);

        boolean result13 = 200 != 200;// false
        System.out.println("result13 = " + result13);

        System.out.println("5 + 2 = " + 3 + 4);// 5 + 2 = 34
        System.out.println("5 + 2 = "  + (3 + 4)); // 5 + 2 = 7


    }

}
