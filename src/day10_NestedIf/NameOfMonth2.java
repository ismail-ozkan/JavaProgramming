package day10_NestedIf;

public class NameOfMonth2 {

    public static void main(String[] args) {

        int n = 5;
        //String result = "";
        // how many unhappy faces will we need use ?? ==> 10         :(  ---->> :()? "" ---> else if block
        int a = 1;
        // additional knowledge about ternaries:
        // ()parenthesis are not mandatory to use
        String result = (n==a++)? "Jan" : (n==a++)? "Feb" : (n==a++)? "Mar" : (n==a++)? "Apr"
                : (n==a++)? "May" :(n==a++)? "Jun" :(n==a++)? "Jul" :(n==a++)? "Ags"
                :(n==a++)? "Sep" :(n==a++)? "Oct" :(n==a++)? "Nov"
                : "Dec";
        // it is important that in ternaries total number of "?" must be equal total number of ":"  !!!!!
        System.out.println("result = " + result);

        /*if (number ==1) {
            result = "January";
        } else if (number ==2){
            result = "February";
        } else if (number ==3){
            result = "March";
        } else if (number ==4){
            result = "April";
        } else if (number ==5){
            result = "May";
        } else if (number ==6){
            result = "June";
        } else if (number ==7){
            result = "July";
        } else if (number ==8){
            result = "August";
        } else if (number ==9){
            result = "September";
        } else if (number ==10){
            result = "October";
        } else if (number ==11){
            result = "November";
        }else {// so number must be 12
            result = "December";
        }*/

        System.out.println("--------------------------------");


    }
}
