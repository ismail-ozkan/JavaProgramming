package day22_MultiDimensionalArray;

public class WarmUpTask2 {
/*
2. Write a program that can reverse the second word of the sentence
			Ex:
				sentence = "I Love Java";

			output:
				I evoL Java
 */
    public static void main(String[] args) {

        String sentence = "I Love Java";

        String[] str = sentence.split(" ");

        String result = "";
        String reverse = "";


        for (int l = str[1].length()-1; l >= 0; l--) {
            reverse+=str[1].charAt(l);
        }

        str[1] = reverse;
        for (int i = 0; i < str.length; i++) {
            result+=str[i];
            if (i== str.length-1) continue;
            result+=" ";
        }

        System.out.println(result);
 /*SECOND WAY
       for (String s : str) {
            System.out.print(s+" ");
        }

         */
    }

}
