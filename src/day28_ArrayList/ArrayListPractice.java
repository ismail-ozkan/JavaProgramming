package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        int i = 1;
        for (int j = 0; j < 5; j++) {
            numbers.add(i++);
        }
        System.out.println(numbers);//[1, 2, 3, 4, 5]
        for (int i1 = 0; i1 < numbers.size(); i1++) {
            numbers.set(i1, numbers.get(i1)*2);// replacing all element with multiplication by 2
        }
        System.out.println(numbers);//[2, 4, 6, 8, 10]
        Integer a = 4;
        numbers.remove(a);// in here a don't represented the index number, but element in the number arrayList
        System.out.println(numbers);

        System.out.println("---------------------------------------");

        ArrayList<String> employees = new ArrayList<>();

        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Aliş");
        employees.add("Hulya");
        employees.add("Neira");
        employees.add("Kolayan");

        System.out.println(employees);

        employees.remove(0);
        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);
        employees.remove(employees.size() - 1);
        System.out.println(employees);

        boolean r1 = employees.remove("Hulya");
        System.out.println(employees);
        System.out.println(r1);//true
        boolean r2 = employees.remove("Hulya");
        System.out.println(r2);// false

    }

}
