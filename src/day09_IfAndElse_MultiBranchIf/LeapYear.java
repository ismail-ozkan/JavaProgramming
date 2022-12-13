package day09_IfAndElse_MultiBranchIf;

public class LeapYear {

    public static void main(String[] args) {

        int year = 2000;

        boolean leapYear = year % 4 == 0;

        if (leapYear){
            System.out.println("Year  "+year+" is leap year.");
        }
        if (!leapYear){
            System.out.println("Year  "+year+" is NOT leap year.");

        }



        if (leapYear){
            System.out.println("Year  "+year+" is leap year.");
        }else {
            System.out.println("Year  "+year+" is NOT leap year.");

        }
    }
}
