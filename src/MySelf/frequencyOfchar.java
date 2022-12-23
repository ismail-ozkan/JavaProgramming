package MySelf;

public class frequencyOfchar {

    public static void main(String[] args) {
        /*
        4. Write a program that can find the frequency of the characters from a string

             Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1
         */

        String str = "aabcccd";
        frequencyOfchar(str);


    }

    private static void frequencyOfchar(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            int counter = 0;
            char ch = str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                if (ch==str.charAt(j)) {
                    counter++;
                }
            }
            if (!result.contains(""+ch)) {
                result+=(ch+"")+counter;
            }
        }
        System.out.println(result);
    }
}
