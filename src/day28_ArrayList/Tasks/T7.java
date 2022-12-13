package day28_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class T7 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,2,3,4,4,5,6,7,7));

        for (Integer each : list) {
            int frequency = 0;
            for (Integer element : list) {
                if (each==element) {
                    frequency++;
                }
            }
            if (frequency>1) {
                System.out.println(each);
                break;
            }
        }
    }

}
/*
7. Write a program that can return the first duplicated element from an arrayList of Integer
		Ex:
			list = [1,2,2,3,4,4,5,6,7,7];
			output:
				2
 */