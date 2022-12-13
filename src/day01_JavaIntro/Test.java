package day01_JavaIntro;

import day24_CustomMethod_Return.ReturnMethodIntro;
import day24_CustomMethod_Return.ReturnMethodPractice4;

public class Test {

    public static void main(String[] args) {

        String str = "adsaaddadasfgdfgdv";

        str = ReturnMethodPractice4.removeDuplicated(str);
        System.out.println(str);

        String name = "Java Programming";

        name = ReturnMethodIntro.reverse(name);
        System.out.println(name);

    }

}
