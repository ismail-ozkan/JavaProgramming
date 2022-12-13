package day15_ForLoop.Tasks;

public class PolindromeSolving {

    public static void main(String[] args) {

        String str = "wordrow";

        String reversed = "";

        for (int i = str.length()-1; i >=0; i--) {
            reversed += str.charAt(i);
        }

        boolean isPolindrome = str.equalsIgnoreCase(reversed);

        System.out.println("isPolindrome = " + isPolindrome);

    }

}
