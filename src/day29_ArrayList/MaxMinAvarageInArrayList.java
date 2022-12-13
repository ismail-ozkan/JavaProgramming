package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxMinAvarageInArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(2,3,1,6,4,5));

        int max = list.get(0);
        int min = list.get(0);
        double avarage = 0;
        for (Integer element : list) {
            if (element>max){
                max=element;
            }
            if (element<min){
                min=element;
            }
            avarage+=element;
        }
        avarage/=list.size();


        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avarage = " + avarage);
    }

}
