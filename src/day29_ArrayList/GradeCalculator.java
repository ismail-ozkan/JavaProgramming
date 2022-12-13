package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeCalculator {

    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));

        ArrayList<Integer> gradeOfA = new ArrayList<>(scores); // 90 - 100
        gradeOfA.removeIf(s -> !(s>=90 && s<=100));
        System.out.println(gradeOfA);

        ArrayList<Integer> gradeOfB = new ArrayList<>(scores); // 80 - 90
        gradeOfB.removeIf(s -> !(s>=80 && s<90));
        System.out.println(gradeOfB);

        ArrayList<Integer> gradeOfC = new ArrayList<>(scores); // 70 - 80
        gradeOfC.removeIf(s -> !(s>=70 && s<80));
        System.out.println(gradeOfC);


        ArrayList<Integer> gradeOfD = new ArrayList<>(scores); // 60 - 70
        gradeOfD.removeIf(s -> !(s>=60 && s<70));
        System.out.println(gradeOfD);

        ArrayList<Integer> gradeOfF = new ArrayList<>(scores); // 0 - 59
//        gradeOfF.removeIf(s -> !(s>=0 && s<60));
        gradeOfF.removeAll(gradeOfA);
        gradeOfF.removeAll(gradeOfB);
        gradeOfF.removeAll(gradeOfC);
        gradeOfF.removeAll(gradeOfD);
        System.out.println(gradeOfF);


        System.out.println("Total number of A: " + gradeOfA.size());
        System.out.println("Total number of B: " + gradeOfB.size());
        System.out.println("Total number of C: " + gradeOfC.size());
        System.out.println("Total number of D: " + gradeOfD.size());
        System.out.println("Total number of F: " + gradeOfF.size());

    }

}
