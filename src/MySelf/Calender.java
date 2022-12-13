package MySelf;

import java.util.ArrayList;
import java.util.Arrays;

public class Calender {

    public static void main(String[] args) {

        int[] days = new int[31];
        for (int i = 1; i <= 31; i++) {
            days[i-1] = i;
        }

        int[] jan = new int[31];
        jan = Arrays.copyOf(days,31);
        int[] feb = new int[28];
        feb = Arrays.copyOf(days,28);
        int[] mar = new int[31];
        mar = Arrays.copyOf(days,31);
        int[] apr = new int[30];
        apr = Arrays.copyOf(days,30);
        int[] may = new int[31];
        may = Arrays.copyOf(days,31);
        int[] jun = new int[30];
        jun = Arrays.copyOf(days,30);
        int[] jul = new int[31];
        jul = Arrays.copyOf(days,31);
        int[] aug = new int[31];
        aug = Arrays.copyOf(days,31);
        int[] sep = new int[30];
        sep = Arrays.copyOf(days,30);
        int[] oct = new int[31];
        oct = Arrays.copyOf(days,31);
        int[] nov = new int[30];
        nov = Arrays.copyOf(days,30);
        int[] dec = new int[31];
        dec = Arrays.copyOf(days,31);

        ArrayList<int[]> listDayInMonths = new ArrayList<>();
        listDayInMonths.addAll(Arrays.asList(jan,feb,mar,apr,may,jun,jul,aug,sep,oct,nov,dec));

        int[][] year = {jan,feb,mar,apr,may,jun,jul,aug,sep,oct,nov,dec};

        for (int[] mounts : year) {
            System.out.println(Arrays.toString(mounts));
        }
        ArrayList<String> daysOf2022 = new ArrayList<>();
        //String[] daysOfWeek = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        int firstDay = 6;
        int numberOfMonth = 1;
        for (int[] month : year) {
            System.out.println("\n"+"---"+nameOfMounts(numberOfMonth).toUpperCase()+"---\n");
            for (int each : month) {
                System.out.println(each+". day of "+nameOfMounts(numberOfMonth)+" is "+dayOfWeek(firstDay%7));
                firstDay++;
            }
            numberOfMonth++;
        }

    }

    private static String dayOfWeek(int day) {

        return (day==1)?"Monday":
                (day==2)?"Tuesday":
                (day==3)?"Wednesday":
                (day==4)?"Thursday":
                (day==5)?"Friday":
                (day==6)?"Saturday":
                (day==0)?"Sunday":"";


    }
    private static String nameOfMounts(int number){
        String result = "";
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
        }else if(number == 12) {
            result = "December";
        }
        return result;
    }


}
