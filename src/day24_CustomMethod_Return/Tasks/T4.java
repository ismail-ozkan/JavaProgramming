package day24_CustomMethod_Return.Tasks;

public class T4 {

    public static void main(String[] args) {

        String word = "level";

        System.out.println(isPalindrome(word));


    }

    public static boolean isPalindrome(String str) {
        boolean isPali = false;
        String reversed = day24_CustomMethod_Return.Tasks.T3.reverse(str.toLowerCase());
        if (reversed.equals(str.toLowerCase())){
            isPali=true;
        }
        return isPali;
    }

}
/*
4. By using the reverse method above to create another method named isPalindrome  that passes a String parameter,
the method returns true if the string is palindrome, otherwise returns false

				Ex:
					str = "Level"

					isPalindrome(str) ===> true
 */