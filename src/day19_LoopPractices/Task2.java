package Day19_LoopPractices;

public class Task2 {
/*
2. Write a program that can return the index number of the first duplicated character from a string
 */
    public static void main(String[] args) {

        String str = "abcddeffgh";

        for (int i = 0; i < str.length(); i++) {
            char ch1 = str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                char ch2 = str.charAt(j);
                if(ch1==ch2&&i!=j) {
                    System.out.println(i);
                    System.exit(0);
                }

            }
        }


    }

}
