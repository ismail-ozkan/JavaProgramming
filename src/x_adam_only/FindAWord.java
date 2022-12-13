package x_adam_only;

public class FindAWord {

    public static void main(String[] args) {

        String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";
        char[] arr = str.toCharArray();
        String result = "";
        for (char each : arr) {
            if (Character.isLetter(each)||each==' '){
                result+=""+each;
            }
        }
        System.out.println(result);

    }

}
/*
Task 1 : Find the word

                    String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";

                    Write a method that returns : Welcome To Core Java
 */