package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmupTasks {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4));

        //1. solution
        Collections.swap(numbers,0,numbers.size()-1);
        System.out.println(numbers);
        //2.solution
        int temp = numbers.get(0);
        numbers.set(0,numbers.get(numbers.size()-1));
        numbers.set(numbers.size()-1,temp);
        System.out.println(numbers.toString());

        System.out.println("-------------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(0,0,0,3,0,0,0,4,1));


        int size = list.size();
        list.removeAll(Arrays.asList(0));// == > list.removeIf(p -> p==0); equals
        int newSize = list.size();
        int totalNumberOfZero = size - newSize;// frequency of zero
        for (int i = 0; i < totalNumberOfZero; i++) {
            list.add(0);
        }

        /*SOLUTION 2 I don't trust(!!!!!) it but it wokrs
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)==0) {
                list.remove(list.get(i));
                list.add(0);
            }
        }*/


        /*SOLUTION 3
        int fre = Collections.frequency(list,0);
        list.removeIf(p -> p==0);
        for (int i = 0; i < fre; i++) {
            list.add(0);
        }*/

        System.out.println(list);

        System.out.println("---------------------------");
        //SOLUTION 4
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(0,0,0,3,0,0,0,4,1));

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list2) {
            if (!(each==0)) {
                result.add(each);
            }
        }
        System.out.println(result);

        System.out.println("-------------------------------");

        String str = "ABCD123$%#@&456EFG!";

        /*Character[] arr = new Character[str.length()];
        //to convert String to char array, we also can use toChar() method :)
        for (int i = 0; i < arr.length; i++) {
            arr[i] = str.charAt(i);
        }
        //System.out.println(Arrays.toString(arr));*/

        ArrayList<Character> chars = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            chars.add( str.charAt(i) );
        }
        ArrayList<Character> letters = new ArrayList<>( chars );
        letters.removeIf(p -> !(Character.isLetter(p)));

        ArrayList<Character> digit = new ArrayList<>( chars );
        digit.removeIf(p -> !(Character.isDigit(p)));

        ArrayList<Character> special = new ArrayList<>( chars );
        // 1. WAY
        special.removeIf(p -> Character.isLetterOrDigit(p));
        //2. WAY
        //special.removeIf(p -> (Character.isLetter(p)||(Character.isDigit(p))));
        //3 . WAY
        //special.removeAll(digit);
        //special.removeAll(letters);

        System.out.println(letters);
        System.out.println(digit);
        System.out.println(special);


    }

}
/*
1. write a program that can swap the first and last elements of an ArrayList

2. Write a program that can move all the zeros to the last indexes of ArrayList

					Ex:
						list: {1,0,2,0,3,0,4,0}

					output:
						[1, 2, 3, 4, 0, 0, 0, 0]


	3. Write a program that can extract the special characters, digits and letters
	from a string and stores them into separate ArrayLists of Characters
				Ex:
					str = "ABCD123$%#@&456EFG!"

				output:
					list1: {1, 2, 3, 4, 5, 6}
					list2: {A, B, C, D, E, F, G}
					list3: {$, %, #, @, &, !}


 */