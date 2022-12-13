package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class nthLargestNumber {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(8,3,2,4,1,2,1,5,6,7,7,8,8));
        int n = 8;//represent 3.largest number
        ArrayList<Integer> orderedList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Integer max = Collections.max(list);
            orderedList.add(max);
            list.removeIf(p -> p==max);
        }
        System.out.println(orderedList);
        System.out.println(list);
        System.out.println(orderedList.get(n - 1));

    }

}
