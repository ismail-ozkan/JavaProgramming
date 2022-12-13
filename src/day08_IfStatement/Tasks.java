package day08_IfStatement;

public class Tasks {
    /*      boolean isMonthJanuary = numberOfMonth == 1;
            boolean isMonthFebruary = numberOfMonth == 2;
            boolean isMonthMarch = numberOfMonth == 3;
            boolean isMonthApril = numberOfMonth == 4;
            boolean isMonthMay = numberOfMonth == 5;
            boolean isMonthJune = numberOfMonth == 6;
            boolean isMonthJuly = numberOfMonth == 7;
            boolean isMonthAugust = numberOfMonth == 8;
            boolean isMonthSeptember = numberOfMonth == 9;
            boolean isMonthOctober = numberOfMonth == 10;
            boolean isMonthNovember = numberOfMonth == 11;
            boolean isMonthDecember = numberOfMonth == 12;


            if (isMonthFebruary){
                System.out.println("This Month is February.");
            }
            if (isMonthMarch){
                System.out.println("This Month is March.");
            }
            if (isMonthApril){
                System.out.println("This Month is April.");
            }
            if (isMonthMay){
                System.out.println("This Month is May.");
            }
            if (isMonthJune){
                System.out.println("This Month is June.");
            }
            if (isMonthJuly){
                System.out.println("This Month is July.");
            }
            if (isMonthAugust){
                System.out.println("This Month is August.");
            }
            if (isMonthSeptember){
                System.out.println("This Month is September.");
            }
            if (isMonthOctober){
                System.out.println("This Month is October.");
            }
            if (isMonthNovember){
                System.out.println("This Month is November.");
            }
            if (isMonthDecember){
                System.out.println("This Month is December.");
    */
    public static void main(String[] args) {

        int numberOfMonth = 10;
        int x = 1;

        if (numberOfMonth == x++){
            System.out.println("This Month is January.");
        }
        if (numberOfMonth == x++){
            System.out.println("This Month is February.");
        }
        if (numberOfMonth == x++){
            System.out.println("This Month is March.");
        }
        if (numberOfMonth == x++){
            System.out.println("This Month is April.");
        }
        if (numberOfMonth == x++){
            System.out.println("This Month is May.");
        }
        if (numberOfMonth == x++){
            System.out.println("This Month is June.");
        }
        if (numberOfMonth == x++){
            System.out.println("This Month is July.");
        }
        if (numberOfMonth == x++){
            System.out.println("This Month is August.");
        }
        if (numberOfMonth == x++){
            System.out.println("This Month is September.");
        }
        if (numberOfMonth == x++){
            System.out.println("This Month is October.");
        }
        if (numberOfMonth == x++){
            System.out.println("This Month is November.");
        }
        if (numberOfMonth == x++){
            System.out.println("This Month is December.");
        }
        // This Month is October.

        System.out.println("--------------------------------");

        int numberOfDay = 4;
        int a = 1;
        if (numberOfDay == a++){
            System.out.println("Today is Monday");
        }
        if (numberOfDay == a++){
            System.out.println("Today is Tuesday");
        }
        if (numberOfDay == a++){
            System.out.println("Today is Wednesday");
        }
        if (numberOfDay == a++){
            System.out.println("Today is Thursday");
        }
        if (numberOfDay == a++){
            System.out.println("Today is Friday");
        }
        if (numberOfDay == a++){
            System.out.println("Today is Saturday");
        }
        if (numberOfDay == a++){
            System.out.println("Today is Sunday");
        }
        //Today is Thursday
    }
}
/*
Initials
	1. write a program that can display the name of the month

			number = 1 ~ 12

	2. write a program that can display the name of the day

			number = 1 ~ 7

	3. Write a program that can print the number of days in a month

			Ex:
				number = 1 ~ 12;

			output:
				31 Days


			Hints:
				Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
				Months that has 30 days: 4, 6, 9, 11
				Month that has 28 days: 2
 */