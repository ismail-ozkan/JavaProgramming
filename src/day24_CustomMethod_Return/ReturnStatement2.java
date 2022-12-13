package day24_CustomMethod_Return;

import java.util.Arrays;

public class ReturnStatement2 {

    public static void main(String[] args) {

        nameOfMonth(50);

        System.out.println("Hello World");

    }


    public static void nameOfMonth(int numOfMonth) {

        if (numOfMonth<1||numOfMonth>12){
            System.err.println("Invalid");
            return;
        }
        String nameMonth = "";
        if (numOfMonth ==1) {nameMonth = "January";
        } else if (numOfMonth ==2){nameMonth = "February";
        } else if (numOfMonth ==3){nameMonth = "March";
        } else if (numOfMonth ==4){nameMonth = "April";
        } else if (numOfMonth ==5){nameMonth = "May";
        } else if (numOfMonth ==6){nameMonth = "June";
        } else if (numOfMonth ==7){nameMonth = "July";
        } else if (numOfMonth ==8){nameMonth = "August";
        } else if (numOfMonth ==9){nameMonth = "September";
        } else if (numOfMonth ==10){nameMonth = "October";
        } else if (numOfMonth ==11){nameMonth = "November";
        }else {nameMonth = "December";}
        System.out.println(Arrays.toString(Arrays.copyOfRange((nameMonth.toUpperCase().toCharArray()),0,3)));
    }


}
