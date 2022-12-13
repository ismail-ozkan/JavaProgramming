package day28_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class T2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));
        int temp = list.get(0);
//   x  list.add(0,list.get(list.size()-1));
//   x  list.add(list.size()-1,temp);
        list.set(0,list.get(list.size()-1));
        list.set(list.size()-1,temp);
        System.out.println(list);


    }
}
/*
2. write a program that can swap the first and last elements of an integer arraylist
	            ex:
	                list = [1,2,3,4,5];
	                output: [5,2,3,4,1];

 */