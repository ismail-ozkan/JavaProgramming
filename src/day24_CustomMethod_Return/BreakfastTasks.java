package day24_CustomMethod_Return;

public class BreakfastTasks {

    public static void main(String[] args) {

        initials("Cydeo","School");

        String email = "woodenSpoon@cydeo.com";

        domain(email);

        nameOfMonth(3);

        nameOfDay(5);

    }

    public static void initials (String firstName, String lastName) {

        System.out.println(firstName.charAt(0)+"."+lastName.charAt(0));

    }

    public static void domain(String email) {

        System.out.println(email.split("\\@")[1]);
    }

    public static void nameOfMonth(int numOfMonth) {

        String nameMonth = "";
        if (numOfMonth ==1) {
            nameMonth = "January";
        } else if (numOfMonth ==2){
            nameMonth = "February";
        } else if (numOfMonth ==3){
            nameMonth = "March";
        } else if (numOfMonth ==4){
            nameMonth = "April";
        } else if (numOfMonth ==5){
            nameMonth = "May";
        } else if (numOfMonth ==6){
            nameMonth = "June";
        } else if (numOfMonth ==7){
            nameMonth = "July";
        } else if (numOfMonth ==8){
            nameMonth = "August";
        } else if (numOfMonth ==9){
            nameMonth = "September";
        } else if (numOfMonth ==10){
            nameMonth = "October";
        } else if (numOfMonth ==11){
            nameMonth = "November";
        }else if (numOfMonth==12){
            nameMonth = "December";
        }
        System.out.println(nameMonth);
    }

    public static void nameOfDay(int numOfDay){
        String dayName = "";
        if (numOfDay>0&&numOfDay<13){
            dayName = (numOfDay==1)? "Monday":(numOfDay==2)? "Tuesday" :(numOfDay==3)? "Wednesday":(numOfDay==4)? "Thursday"
                    :(numOfDay==5)? "Friday":(numOfDay==6)? "Saturday" : "Sunday";
        }
        System.out.println(dayName);

    }

}
/*
Warmup tasks:
	1. Create a method that can display the initials of the person

	2. Create a method that can display the domain of the email

	3. Create a method that can display the name of the month based on the given number to the method

	4. Create a method that can print the name of the day based on the given number to the method

	5. Create a method that can print how many days a month has
 */