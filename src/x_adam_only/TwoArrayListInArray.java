package x_adam_only;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoArrayListInArray {

    public static void main(String[] args) {

        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(4,5,6));

        System.out.println(Arrays.toString(mergeLists(numbers1,numbers2)));
        System.out.println("--------------------");
        System.out.println(Arrays.toString(mergeLists2(numbers1,numbers2)));
    }


    public static int[] mergeLists(ArrayList<Integer> list1, ArrayList<Integer> list2){
        int[] result = new int[list1.size()+list2.size()];
        int i = 0;
        for (Integer each : list1) {
            result[i++] = each;
        }
        for (Integer each2 : list2) {
            result[i++] = each2;
        }

        return result;
    }
    public static int[] mergeLists2(ArrayList<Integer> list1, ArrayList<Integer> list2){
        list1.addAll(list2);
        int[] result = new int[list1.size()];
        for (int i = 0; i < list1.size(); i++) {
            result[i] = list1.get(i);
        }
        return result;
    }
}
