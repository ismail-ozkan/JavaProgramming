package day17_While_DoWhile;

public class FrequencyOfWord_WhileLoop {

    public static void main(String[] args) {

        String str = "Java Java Java Java Java Python";
        int freq = 0;

        while (str.contains("Java")) {
            freq++;
            str = str.replaceFirst("Java","");
        }

        System.out.println(freq);

        System.out.println("-----------------------------------");

        String sentence = "cat cat cat cat dog dog cat cat";

        int countCat = 0;

        while (sentence.contains("cat")) {
            sentence = sentence.replaceFirst("cat", "");
            countCat++;
        }

        System.out.println("countCat = " + countCat);

        System.out.println("-----------------------------------");

        String s = "java java java python python python";
        int countJava = 0;
        int countPython = 0;

        while (s.contains("java")||s.contains("python")) {

            if (s.contains("java")) {
                s = s.replaceFirst("java","");
                countJava++;
            }

            if (s.contains("python")) {
                s = s.replaceFirst("python","");
                countPython++;
            }
        }
        // if we want we can two while lop for this task without any if statement

        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);


    }

}
