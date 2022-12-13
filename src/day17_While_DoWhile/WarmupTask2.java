package day17_While_DoWhile;

public class WarmupTask2 {
/*
2. write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "JavaJavaJava";

            output: 3
 */
    public static void main(String[] args) {

        String sentence = "JavaJavaJava";
        int frequency = 0;

        for (int i=0; i<sentence.length()-3; i++) {
            String eachSub = sentence.substring(i,i+4);
            if (eachSub.equals("Java")) {
                frequency++;//frequency += 1;
            }
        }
        System.out.println(frequency);





        // MY SOLUTION WRONG!!!
        /*String sentence = "JavaJavaJava";
        int frequency = 0;

        for (int i=0; i<sentence.length()-3; i++) {
            if (sentence.substring(i).equals("Java")) {
                frequency += 1;
            }
        }
        System.out.println(frequency);*/
    }
}
