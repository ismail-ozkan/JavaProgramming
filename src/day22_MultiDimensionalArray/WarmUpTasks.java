package day22_MultiDimensionalArray;

public class WarmUpTasks {
/*
1. Write a program that can reverse a sentence
			Ex:
				sentence = "Today is a good day to learn Java";

			output:
				Java learn to day good a is Today
 */
    public static void main(String[] args) {

        String sentence = "Today is a good day to learn Java";
        String[] str = sentence.split(" ");
        String revers = "";

        for (int i = str.length - 1; i >= 0; i--) {
            revers += str[i];
            if (i==0) continue;
            revers += " ";
        }

        System.out.println(revers);


    }

}
