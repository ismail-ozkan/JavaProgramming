package day03_Escape_Sequences;

public class Println_VS_Print2 {

    public static void main(String[] args) {

        System.out.println("Knock Knock");
        System.out.println("Who is this?");

        System.out.println("This is Java");

        System.out.println("-------------------------");

        System.out.print("Knock Knock");
        System.out.println("Who is this?");

        System.out.println("------------------------------1\b-");

        System.out.println("Hello everyone, How are you all today? Today we will learn Escape Sequences, and next week we will learn Variables");

        System.out.print("Hello everyone, How are you all today? ");
        System.out.print("Today we will learn Escape Sequences, ");
        System.out.println("and next week we will learn Variables");
        // this second type is more readable but it don't use very much
    }

}
