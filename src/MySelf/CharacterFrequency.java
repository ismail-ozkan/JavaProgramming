package MySelf;

import java.util.ArrayList;
import java.util.Collections;

public class CharacterFrequency {

    public static void main(String[] args) {

        System.out.println(countLetters("aaabcbcbacahdkahlfahkfhafafa"));
    }

    public static String countLetters(String str){

        /*String result = "";
        for (int i = 0; i < str.length(); i++) {
            int counter = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)) {
                    counter++;
                }
            }
            if (!result.contains(""+str.charAt(i))) {
                result+=""+counter+str.charAt(i);
            }
        }
        return result;*/
        String result ="";
        char[] chars = str.toCharArray();
        ArrayList<Character> list1 = new ArrayList<>();
        for (char ch : chars) {
            list1.add(ch);
        }
        for (Character each : list1) {
            if (!result.contains(""+each)) {
                result+=""+Collections.frequency(list1,each)+each;
            }
        }
        return result;
    }

}