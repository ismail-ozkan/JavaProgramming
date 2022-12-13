package x_adam_only;

import java.util.ArrayList;
import java.util.Arrays;

public class School {

    public static void main(String[] args) {

        Student student1 = new Student("Bruce",'M',"May",40,13,4.3);
        Student student2 = new Student("Aruce",'M',"Agu",43,14,4.3);
        Student student3 = new Student("Bruce",'M',"Apr",30,15,4.3);
        Student student4 = new Student("Azuce",'F',"May",24,16,4.3);
        Student student5 = new Student("Ahmet",'M',"Sep",32,17,4.3);

        ArrayList<Student> school = new ArrayList<>();
        school.addAll(Arrays.asList(student1,student2,student3,student4));
        school.add(student5);

        whichStudent(school,'A');


    }
    public static void whichStudent(ArrayList<Student> list, char startingOfName ){
        list.removeIf(p -> !(p.name.charAt(0)==startingOfName));
        System.out.println(list);
    }
}
