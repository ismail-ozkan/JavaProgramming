package x_adam_only;

public class TwoWord {

    public static void main(String[] args) {


        String str = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";

        String[] strArr = str.split(", ");

        for (String each : strArr) {
            if (each.contains(" ")){
                System.out.println(each);
            }
        }


    }

}
/*
Task 2 :	Write a program that accepts string and prints multiple words in the string

        "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer"

        output : wooden spoons
        		 trash can
         		 dish washer
 */