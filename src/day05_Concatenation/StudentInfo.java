package day05_Concatenation;

public class StudentInfo {

    public static void main(String[] args) {

        String student_name = "ismail";
        int age = 31;
        char gender = 'M';// *** single qoute use, don't forget it !!!
        String schoolName = "Cydeo";
        String phone_number1 = "(+90)-552-730-9562";
        long phone_number2 = (+90)-552-730-9562;// output is -->>  phone_number2 = -10754
        boolean is_full_time = true;
        double GPA = 3.1;// Grade Point Average



        System.out.println("schoolName = " + schoolName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("schoolName = " + schoolName);
        System.out.println("phone_number1 = " + phone_number1);
        System.out.println("is_full_time = " + is_full_time);
        System.out.println("GPA = " + GPA);
        System.out.println("phone_number2 = " + phone_number2);// output is -->>  phone_number2 = -10754
    }

}
/*
2. Create a class called StudentInfo, and declare variables for the followings:
    			1. student name (String)
    			2. age (int)
    			3. gender (char)
    			4. school name (String)
    			5. phone number (String) (###)-###-####
    			6. full time (boolean)

 */