package x_adam_only;

import java.util.ArrayList;

public class UniqueInTwo {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,5,6};
        System.out.println(uniqueInTwo(arr1, arr2));


    }

    public static ArrayList<Integer> uniqueInTwo(int[] arr1, int[] arr2) {

        ArrayList<Integer> result = new ArrayList<>();
        for (int i : arr1) {
            if (!result.contains(i)){
                result.add(i);
            }
        }
        for (int j : arr2) {
            if (!result.contains(j)){
                result.add(j);
            }
        }
        return result;


    }

}
/*
Task 3 :

Create a method that get two arrays as a parameters then return the arraylist which has contains unique elements in it.

first array :1,2,3,4,5

second array :4,5,6

output:

1,2,3,4,5,6
 */