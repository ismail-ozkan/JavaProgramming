package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class nthLargestNumber1 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(8,3,2,4,1,2,1,5,6,7, 7 ,8, 8));
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>(list);
        int n = 3;
        int max = Collections.max(list);
        System.out.println(list3);
        for (Integer each : list) {

            if (list3.size()>0){
               max = Collections.max(list3);
            }
            if (!list2.contains(each)){
                list2.add(max);
            }

        }
        System.out.println(list3);
        System.out.println(list2);
        System.out.println(list2.get(n - 1));

    }

}
