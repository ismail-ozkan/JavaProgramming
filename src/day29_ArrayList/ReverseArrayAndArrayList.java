package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseArrayAndArrayList {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6};

        int[] result = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--,j++) {
            result[j]=array[i];
        }
        System.out.println(Arrays.toString(result));

        System.out.println("----------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7));

        ArrayList<Integer> reversed = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }

        System.out.println(reversed);
        //OTHER SOLUTIONS
       /* for (int i = 0; i < list.size() / 2; i++) {
            Collections.swap(list,i,list.size()-1-i);
        }
        System.out.println(list);
        */


        /*ArrayList<Integer> result2 = new ArrayList<>();
        Collections.reverse(list);
        result2 = list;

        System.out.println(result2);
*/


    }

}
