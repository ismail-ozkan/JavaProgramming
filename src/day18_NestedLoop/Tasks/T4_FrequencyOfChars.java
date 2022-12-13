package day18_NestedLoop.Tasks;

public class T4_FrequencyOfChars {
/*
4. Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1


            Hint: if you find out how to find the frequency of one character,
             then repeat it for all the remaining characters
 */
    public static void main(String[] args) {

        String str = "aabcccd";
        int counter = 0;
        String res = "";

        while (!(str.isEmpty())){
            String ch = ""+str.charAt(0);
            int freq = 0;
            while (true){
                if (str.substring(1).contains(ch)){
                    freq++;
                    str=str.replaceFirst(ch,"");
                } else {
                    freq++;
                    break;
                }

            }
            res+=ch+freq;
            str=str.replaceAll(ch,"");
        }

        System.out.println(res);

    }

}
