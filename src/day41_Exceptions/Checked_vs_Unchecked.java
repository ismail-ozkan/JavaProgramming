package day41_Exceptions;

import day39_Recap.studentTask.Student;

import java.io.FileInputStream;

public class Checked_vs_Unchecked {

    public static void main(String[] args) {

        //Unchecked exception

        int a = 10;
        int b = 0;

    //    System.out.println("Wooden Spoon");
    //    System.out.println( a / b );


        char[] characters = {'A', 'B', 'C'};

    //    System.out.println(characters[99]);//---> ArrayIndexOutOfBoundsException in java.lang package

        Student student = null;

    //    System.out.println(student.getName());//.NullPointerException

    //    student.study();//.NullPointerException

        final String str = "Wooden Spoon";

       // str = null;

    //    System.out.println(str.toLowerCase());// //.NullPointerException

        String str2 = "";// object != null --> true

        System.out.println(str2.isEmpty());



        // Checked Exception
        System.out.println("Hello");

        //Thread.sleep(1991);//InterruptedException

        System.out.println("Cydeo");


        //FileInputStream file = new FileInputStream("path of the file");//FileNotFoundException


        System.out.println("java".charAt(20000));//unchecked exception


    }

}
