package day03_Escape_Sequences;
/*
Escape Sequences: Must be given with double qoute
    \n : starts a new line
    \t : pragraph space (tab)
    \\ : print one \ (backslash
    \" : double qoute
 */

public class Escape_Sequences {

    public static void main(String[] args) {

        System.out.println("Java \nPython \nC#");

        System.out.println("-----------------------------------");

        System.out.println("Hello Cydeo How are you all today? It's nice to see you all! What class do we have next week?");
        System.out.println("Hello Cydeo \nHow are you all today? \nIt's nice to see you all! \nWhat class do we have next week?");

        System.out.println("-----------------------------------");

        System.out.println("\tJava is Cool Programing Language");// \t = 4 spaces
        System.out.println("    Java is Cool Programing Language");

        System.out.println("-----------------------------------");

        System.out.println("I want to print one back slash, so I write two backslash but one print \\");
        System.out.println("/ \\"); // out : /\

        System.out.println("-----------------------------------");

        System.out.println("My favorite TV show is \"Hz.Yusuf\""); // in order to print a double qoute(") we need to use backward slash(\)

    }

}
