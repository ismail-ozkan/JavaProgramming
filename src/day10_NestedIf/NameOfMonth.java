package day10_NestedIf;

public class NameOfMonth {

    public static void main(String[] args) {
        int number = 11;
        String result = "";// to prevent non-assignment data error!!(temporary value)    -LOCAL DATA-
        
        if (number >= 1 && number <= 12){ //pre-condition if statement (number = 1~12)
            if (number ==1) {
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
            }
            
        }else {
            result = "Invalid number";
        }

        System.out.println(result);
        
        
    }
}
