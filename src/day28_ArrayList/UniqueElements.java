package day28_ArrayList;

import java.util.ArrayList;

public class UniqueElements {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Java");
        list.add("Java");
        list.add("Python");
        list.add("C#");
        list.add("C#");
        list.add("C#");
        list.add("Ruby");
        list.add("C++");
        list.add("C++");


        ArrayList<String> unique = new ArrayList<>();

        for ( String each : list) {
            if (list.indexOf(each)==list.lastIndexOf(each)) {
                unique.add(each);
            }
        }
        System.out.println(unique);
        int absent = unique.indexOf("a"); // -1
        System.out.println(absent);


    }

}
