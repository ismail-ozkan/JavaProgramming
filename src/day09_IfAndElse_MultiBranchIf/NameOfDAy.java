package day09_IfAndElse_MultiBranchIf;

public class NameOfDAy {

    public static void main(String[] args) {
        //  number between 1 ~ 7
        int  n = 5;

        String day;

        if(n == 1){
            day = "Monday";
        }else if(n == 2){
            day = "Tuesday";
        }else if(n == 3){
            day = "Wednesday";
        }else if( n == 4){
            day = "Thursday";
        }else if(n == 5){
            day = "Friday";
        }else if(n==6){
            day = "Saturday";
        } else{
            day = "Sunday";
        }

        System.out.println("day = " + day);// we use only one print statement

        System.out.println("-----------------------------------");
// my solution
/*
        int one = 1;
        if (  num == one++) {
            //System.out.println("Monday");
            day = "Monday";

        } else if (  num == one++) {
            //System.out.println("Tuesday");
            day = "Tuesday";

        } else if (  num == one++) {
            //System.out.println("Wednesday");
            day = "Wednesday";

        } else if (  num == one++) {
            //System.out.println("Thursday");
            day = "Thursday";

        } else if (  num == one++) {
            //System.out.println("Friday");
            day = "Friday";

        } else if (  num == one++) {
            //System.out.println("Saturday");
            day = "Saturday";

        } else if (  num == one++){
            //System.out.println("Sunday");
            day = "Sunday";

        } else {
            //System.out.println("Invalid");
            day = "Thursday";
        }
*/
    }
}
