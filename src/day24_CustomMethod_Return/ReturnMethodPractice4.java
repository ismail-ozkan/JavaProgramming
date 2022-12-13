package day24_CustomMethod_Return;

public class ReturnMethodPractice4 {

    public static void main(String[] args) {

        String sentence = "aaabbcccc";

        String withoutDuplicated = removeDuplicated(sentence);

        System.out.println(withoutDuplicated);

    }

    //1. create a method that can remove duplciated characters from a string and returns the new value
    //					"aaabbcccc" ===> "abc"
    public static String removeDuplicated(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i+1).contains(""+str.charAt(i))){
                continue;
            }else {
                result+=str.charAt(i);
            }
        }
        /*for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!result.contains(""+ch)){
                result+=ch;
            }
        }*/
        return result;
    }



}
