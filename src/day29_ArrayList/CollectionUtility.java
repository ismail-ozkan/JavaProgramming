package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtility {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,9,8,7,6,5,4,3,1));

        Collections.sort(list);// sort elements ascending order

        System.out.println(list);//[1, 3, 4, 5, 6, 7, 8, 9, 10]

        System.out.println("-----------------------------------");

        ArrayList<Character> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList('A', 'B', 'C', 'D', 'E'));

        Collections.reverse(list2);// to reverse order
        System.out.println(list2);//[E, D, C, B, A]


        System.out.println("-----------------------------------");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(10, 20, 30, 40, 50, 60, 70));

        //to swap two elements
        Collections.swap(list3,1,4);//Collections.swap(list3,4,1);
        System.out.println(list3);

        System.out.println("-----------------------------------");

        int max = Collections.max(list3);
        int min = Collections.min(list3);

        System.out.println("min = " + min);
        System.out.println("max = " + max);

        System.out.println("-----------------------------------");

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(10,10,20,30,40,50,10,10,10));

        Collections.replaceAll(list4,10,100);

        System.out.println(list4);//[100, 100, 20, 30, 40, 50, 100, 100, 100]

        System.out.println("-----------------------------------");

        int frequency = Collections.frequency(list4,100);//return int value
        System.out.println("frequency = " + frequency);//5

        System.out.println("-----------------------------------");

        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java", "Java", "Python", "Python", "Ruby", "C#", "Java"));
        int countJava = Collections.frequency(words,"Java");
        int countPython = Collections.frequency(words,"Python");

        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);

    }

}
