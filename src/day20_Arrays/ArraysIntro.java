package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        // create a variable that's capable enough to contain 5 names

        //String[] myGroup;
        //String myGroup[];
        // X String[] myGroup[] X ---> not single dimensional

        String[] myGroup = new String[5];//0 ~ 4 index number

        // System.out.println(myGroup);//[Ljava.lang.String;@511baa65 ---> hash code

        System.out.println(Arrays.toString(myGroup));//[null, null, null, null, null]

        myGroup[0] = "Halid";
        myGroup[1] = "İbrahim";
        myGroup[2] = "İsmail";
        myGroup[3] = "Burhan";
        myGroup[3] = "Görkem";
        //myGroup[5] = "Muhtar";
        //myGroup[-1] = "Adam"; OutOfBounderExpectation
        System.out.println(Arrays.toString(myGroup));//[Halid, İbrahim, İsmail, Burhan, null]

        System.out.println(myGroup[4]);

        System.out.println("----------------------------------------------------");

        String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // days[7] = "JavaDay"; OutOfBounderExpectation because we set the size of array first and cannot change yet
        System.out.println(Arrays.toString(days));
        System.out.println(days.length);//7

        int number = 5;
        if (number < 1 || number > 7 ){
            System.err.println("Invalid Number");
            System.exit(0);
        }

        System.out.println(days[number-1]);
    }

}
