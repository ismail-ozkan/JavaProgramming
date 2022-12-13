package day23_CustomMethods_Void.Tasks;

public class T13 {

    public static void main(String[] args) {

        String text = "I love learning Java :)";

        printEachChar(text);

    }

    //13. create a method named printEachChar that can print each characters of a string
    public static void printEachChar(String text) {

        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }

    }


}
