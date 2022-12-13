package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {

    public static void main(String[] args) {

        String[] countries = {"Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada", };
        // converting array to ArrayList:
        ArrayList<String> listOfCountries = new ArrayList<>(Arrays.asList(countries));

        listOfCountries.removeIf(each -> each.length()>=10);
        System.out.println(listOfCountries);

        //converting ArrayList to array
        countries = listOfCountries.toArray(new String[0]);

        System.out.println(Arrays.toString(countries));



    }

}
