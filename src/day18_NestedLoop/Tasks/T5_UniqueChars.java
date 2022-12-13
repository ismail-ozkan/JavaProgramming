package day18_NestedLoop.Tasks;

public class T5_UniqueChars {
/*
5. Write a program that can find the unique characters from a string
without using index() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf

            Hint: if you find out how to find the frequency of one character,
            then you can repeat it for the remaining characters to find the frequency.
            		if frequency of a character == 1  =========> unique
 */
    public static void main(String[] args) {

        String str = "aabccdeef";
        String uniq = "";
        int freq = 0;

        while (!(str.isEmpty())) {
            String ch = str.charAt(0)+"";
            if (str.substring(1).contains(ch)) {
                str=str.replaceAll(ch,"");
            } else {
                uniq+=ch;
                str=str.replaceAll(ch,"");
            }
        }
        System.out.println(uniq);
    }

}
