package day28_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class T4 {

    public static void main(String[] args) {

        ArrayList<String> arr1 = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        arr1.addAll(Arrays.asList("A", "B", "C"));
        arr2.addAll(Arrays.asList("D", "E", "F", "G"));
        for (String element : arr1) {
            list.add(element);
        }
        for (String each : arr2) {
            list.add(each);
        }
        System.out.println(list);
    }
}
/*
4. write a program that can combine two String arrays into one arrayList
	            ex:
	                arr1 = {"A", "B", "C"};
	                arr2 = {"D", "E", "F", "G"};
	                list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */