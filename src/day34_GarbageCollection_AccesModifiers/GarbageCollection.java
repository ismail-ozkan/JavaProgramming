package day34_GarbageCollection_AccesModifiers;


import day30_CustomClass.Dog;
import day31_Constructors.Student;
import day32_Constructors.Car;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {

    public static void main(String[] args) {
        /*
        //int n = null;
        String str = null;
        System.out.println(str.toUpperCase());//NullPointerException
        */

        String str = "Wooden Spoon";// after line 13, it will be eligible for garbage collection
        str = null;

        System.out.println(str);

        Car car1 = new Car("Toyota");

        car1 = null;

        System.out.println(car1);

        System.out.println("-----------------------------------------------");

        Dog dog1 = new Dog();

        dog1.name = "Lucy";

        dog1 = new Dog();

        dog1.name = "Max";

        System.out.println(dog1);


        String language = "Python";

        language  =     "Java";// "Python" object is eligible for garbage collection now.

        System.out.println(language);

        System.out.println("------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(100);

        ArrayList<Integer> list2 = list1;//we create only one Arraylist object after 49.line

        list2.addAll(Arrays.asList(200,300,400));// we add these elements to object we have
        // ( beacuse we only one object now, list1 and list2 open the same place like a room

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1 == list2);// true

        System.out.println("------------------------------------");

        Student student1 = new Student("Tahir",30,'M','B',14);
        student1.grade = 'A';

        Student student2 = student1;// they are same student and if we change any element, it changes for both of them
        student2.name = "Ahmet";

        System.out.println(student1);
        System.out.println(student2 );

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Java");

        ArrayList<String> l2 = new ArrayList<>();
        l2.add("Python");


        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);

        l1 = l2;// now "Java" object is eligible for garbage collection
        System.out.println("l1 = " + l1);


    }

}
