package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharcters {

    public static void main(String[] args) {

        String str = "aaabcccdeeefgggggggghiiiiiiiiijkkkkkkkkkl";

        //String[] strArr = str.split("");
        // we shouldn't use the toCharArray() method because toCharArray() method give us a char[] array
        // and it is a primitive array, ArrayList doesn't support primitive ,
        //because of that we need to use split() method that give as a String[] Array( it is non-primitive)

        //ArrayList<String> strArrList = new ArrayList<>(Arrays.asList(strArr));
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        System.out.println(list);

        /* instead of split("") method
        String[] arrTry = new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arrTry[i] = ""+str.charAt(i);
        }
        System.out.println(Arrays.toString(strArr));*/
        String unique = "";
        for (String each : list) {
            if (Collections.frequency(list,each)==1) {
                unique += each;
            }
        }
        System.out.println("unique = "+unique);

    }

}
