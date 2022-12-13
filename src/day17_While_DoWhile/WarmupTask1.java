package day17_While_DoWhile;

public class WarmupTask1 {
/*
1. Write a program that can return the frequency of a char from a String

			Ex:
				str = "AAABBBC"
				ch = 'A'
			Output:
				3
 */
    public static void main(String[] args) {

        String str1 = "AAABBBC";
        char ch1 = 'A';

        int frequency = 0;

        for (int i=0; i < str1.length(); i++) {// i: indexes of str1
            char eachChar = str1.charAt(i);// eachChar: each character of str1

            if (ch1 == eachChar) {
                frequency++;
            }
        }
        System.out.println(frequency);


        // MY SOLUTION
        String str = "AAABBBC";
        char ch = 'A';
        int control = 0;

        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i)==ch) {
                control++;// control +=1;
            }
        }

        System.out.println(control);
    }
}
