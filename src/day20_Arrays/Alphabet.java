package day20_Arrays;

import java.util.Arrays;

public class Alphabet {

    public static void main(String[] args) {

        char[] alphabet = new char[26];// Z - A

        alphabet[0] = 'Z';

        //System.out.println( alphabet );
        System.out.println(Arrays.toString(alphabet));// convert Array to String
        System.out.println(alphabet[0]);//'Z'
        System.out.println((int) (alphabet[0]));//90

        char ch = alphabet[0];
        for (int i = 0; i < alphabet.length; i++, ch--) {
            alphabet[i] = ch;
        }

        System.out.println(Arrays.toString(alphabet));// convert Array to String


        char[] alphabet2 = new char[26];// Z - A

        for (char i=0, j='Z'; i<alphabet2.length; i++, j--) {
            alphabet2[i] = j;
        }

        System.out.println(Arrays.toString(alphabet2));
    }

}
