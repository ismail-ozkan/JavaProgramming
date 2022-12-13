package day13_String;

public class StringMethods {

    public static void main(String[] args) {

        String word = "Cydeo";

        char thirdChar = word.charAt(3);//4.letter

        System.out.println("thirdChar = " + thirdChar);

        /*
        char tenthChar = word.charAt(9);

        System.out.println("tenthChar = " + tenthChar);
        */

        String s1 = "Batch 25 is the best batch. Java Prgoramming language";

        int totalChar = s1.length();

        System.out.println("totalChar = " + totalChar);

        char lastChar = s1.charAt( s1.length() - 1 );// index =
        //char lastChar = s1.charAt( totalChar - 1 );
        System.out.println("lastChar = " + lastChar);

        System.out.println("--------------------------");


        String str = "wooden spoon";// we stored str as a variable with data

        str.toUpperCase();// WOODEN SPOON

        System.out.println("str = " + str);//wooden spoon-- because we dont assign new data to str variable and
                                            // now str didnt change yet. besides String data type is UMMITBL

        str = str.toUpperCase();// in here we assign a new data in str variable
        System.out.println("str = " + str);//WOODEN SPOON



    }

}
