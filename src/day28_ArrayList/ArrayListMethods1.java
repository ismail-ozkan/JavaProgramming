package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods1 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);//0
        numbers.add(20);//1
        numbers.add(30);//3
        numbers.add(40);//4
        numbers.add(50);//5
        numbers.add(2,25);//2
        numbers.add(6,60);//6
        //numbers.add(8,80);//



        System.out.println(numbers.size());
        int lastIndex = numbers.size()-1;

        System.out.println("lastIndex = " + lastIndex);

        int num = numbers.get(3); // unboxing

        System.out.println("num = " + num);

        System.out.println("------------------------------------");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("------------------------------------");

        for (Integer number : numbers) {
            System.out.println(number);
        }

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        System.out.println(list);

        list.set(2, "JavaScript");

        System.out.println(list);

        list.set(3, "C##");
        System.out.println(list);










    }

}
