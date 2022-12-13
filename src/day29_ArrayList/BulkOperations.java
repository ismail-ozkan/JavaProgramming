package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.jar.JarEntry;

public class BulkOperations {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,3,3,3,4,5,5,5,5,6,7,8,8,8,8,9,10));

        System.out.println(list);

        list.removeAll(Arrays.asList(3,5,8));// all 3s 5s 8s go

        System.out.println(list);//[1, 2, 4, 6, 7, 9, 10]

        list.retainAll(Arrays.asList(1,2,10,7));//[1, 2, 7, 10] other element fly(remove)
        System.out.println(list);

        /*list.retainAll(Arrays.asList(list.get(0)));//1
        System.out.println(list);
        */

        System.out.println("-----------------------------");


        ArrayList<String> jobTitles = new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA", "SDET", "Developer", "QA", "SDET", "Scrum Master", "BA", "BA"));

        jobTitles.retainAll(Arrays.asList("QA","SDET"));
        System.out.println(jobTitles);


        System.out.println("-------------------------------------------");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(  Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9,10) );

        boolean r1 = nums.contains(10);
        boolean r2 = nums.contains(2) && nums.contains(2) && nums.contains(10);
        boolean r3 = nums.containsAll(Arrays.asList(2,5,100));


        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);


        System.out.println("-------------------------------------------");

        String[] names = {"Josh", "Jack", "Daniel","Shay","Breanna"};

        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names));

/*HARD WAY
        ArrayList<String> namesList = new ArrayList<>();
        namesList.addAll(Arrays.asList(names));
*/

        System.out.println(namesList);

        System.out.println("-------------------------------------------");

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        Integer[] arr2 = {1,2,3,4,5,6,7,8,9,10};

        //ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr2));

        System.out.println(list2);

        System.out.println("-------------------------------------------");

        int[] arr3 = {1,2,3,4,5,6,7,8,9,10};

        //System.out.println(convertArrayToArrayList(arr3));
        ArrayList<Integer> list3 = new ArrayList<>(convertArrayToArrayList(arr3));
        System.out.println(list3);
    }

    public static ArrayList<Integer> convertArrayToArrayList(int[] array) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int each : array) {
            list.add(each);
        }
        return list;
    }

}
