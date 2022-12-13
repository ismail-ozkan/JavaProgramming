package x_adam_only;

import java.util.ArrayList;
import java.util.Arrays;

public class DivisibleBy3 {

    public static void main(String[] args) {

        int[] numbers = {2,3,4,5,6,8,9};
        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.addAll(Arrays.asList(2,3,4,5,6,8,9));

        divisible3(numbers);
        divisibleBy3(numbersList);
    }

    public static void divisible3(int[] array){
        int counter = 0;
        for (int each : array) {
            if (each%3==0) {
                counter++;
            }
        }
        int[] result = new int[counter];
        for (int i = 0,j=0; i < array.length; i++) {
            if (array[i]%3==0) {
                result[j++]=array[i];
            }
        }
        System.out.println(Arrays.toString(result));
    }

    public static void divisibleBy3(ArrayList<Integer> list) {

        list.removeIf(p -> !(p%3==0));

        System.out.println(list);

    }

}
