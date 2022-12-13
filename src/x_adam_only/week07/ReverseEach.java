package x_adam_only.week07;

public class ReverseEach {

    public static void main(String[] args) {

        String str = "Adam come here";
        str += " ";
        String result = "";
        String eachWord = "";
        for (int i = 0; i < str.length(); i++) {
            // in order to obtain eachWord
            char ch = str.charAt(i);
            if (ch != ' ') {
                eachWord += ch;
                continue;
            }
            String searched = eachWord;
            // in order to reverse eachWord
            String reverseOne = "";
            for (int l = searched.length() - 1; l >= 0; l--) {
                reverseOne += searched.charAt(l);
            }
            //in order to concatenate eachWord for the result
            result += reverseOne + " ";
            eachWord = "";
        }

        System.out.println(result);


    }

}
/*
Task 4: Reverse each word in a sentence.

    input:

    String str = "Adam come here";

    output:

    madA emoc ereh
 */
