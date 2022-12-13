package day28_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class T8 {

    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));


        ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59


        gradeOfA.addAll(scores);
        gradeOfA.removeIf(p -> (p<90||p>100));

        gradeOfB.addAll(scores);
        gradeOfB.removeIf(p -> (p<80||p>=90));

        gradeOfC.addAll(scores);
        gradeOfC.removeIf(p -> (p<70||p>=80));

        gradeOfD.addAll(scores);
        gradeOfD.removeIf(p -> (p<60||p>=70));

        gradeOfF.addAll(scores);
        gradeOfF.removeIf(p -> p>60);

        System.out.println("Total number of grade A: " + gradeOfA.size());
        System.out.println("Total number of grade B: " + gradeOfB.size());
        System.out.println("Total number of grade C: " + gradeOfC.size());
        System.out.println("Total number of grade D: " + gradeOfD.size());
        System.out.println("Total number of grade F: " + gradeOfF.size());

    }

}
/*
8. Given the following arraylists:
		ArrayList<Integer>  scores = new ArrayList<>();
  		scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));


  		ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59


        Write a program that can count the total numbers of grade A, B, C, D and F
 */