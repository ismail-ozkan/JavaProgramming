package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstUniqueElement {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,3,3,4,5,5));

        System.out.println(FirstUnique(list));

    }

    public static int FirstUnique(ArrayList<Integer> list) {
        int result = 0;
        for (Integer each : list) {
            int counter = 0;
            for (Integer element : list) {
                if (each==element) {
                    counter++;
                }
            }
            if (counter==1) {
                result = each;
                break;
            }
        }
        return result;
    }

}
