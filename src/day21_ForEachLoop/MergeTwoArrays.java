package day21_ForEachLoop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

        String[] group1 = {"Ali", "Layan", "Aysenur" }; // 3
        String[] group2 = {"Maria", "Aygun", "Duygu", "Suat", "Valeriy"}; //5

        String[] students = new String[group1.length + group2.length];

        int i = 0;
        for (String student : group1) {
            students[i++] = student;
        }
        for (String student : group2) {
            students[i++] = student;
        }

        System.out.println(Arrays.toString(students));
    }

}
