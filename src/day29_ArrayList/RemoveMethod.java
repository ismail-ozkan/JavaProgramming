package day29_ArrayList;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveMethod {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        //remove all odd numbers
        /*
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)%2!=0) {
                list.remove(i);
            }
        }*/
        //    LAMBDA EXPRESSİON
        list.removeIf( p -> p%2!=0);//p represents element of ArrayList, -> sign is special for removeIf method,
        //              -> SIGN is reserved for LAMBDA EXPRESSİON
        // other part is condition in the loop

        System.out.println(list);//[2, 4, 6, 8, 2, 4, 6, 8, 2, 4, 6, 8]
        System.out.println("--------------------------------");


        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        // remove the all even number
        list2.removeIf(each -> each%2==0);//    LAMBDA EXPRESSİON
        System.out.println(list2);//[1, 3, 5, 7, 9]

        System.out.println("----------------------------------------------------");

        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList("Java", "Python", "JavaScript", "C#", "C++", "Java", "Java"));

        list3.removeIf(p -> p.startsWith("J") );
        System.out.println(list3);//[Python, C#, C++]

        System.out.println("----------------------------------------------------");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Anna", "Racecar", "Level", "Eye", "Java", "Python", "Cydeo"));

        names.removeIf(name -> StringUtility.isPalindrome(name));
        System.out.println(names);//[Java, Python, Cydeo]


    }

}
