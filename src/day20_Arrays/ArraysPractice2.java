package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2 {

    public static void main(String[] args) {

        char[] letters = new char[26];

/*
        letter[0] = 'A';
        letter[1] = 'B';
        letter[2] = 'C';
        ....
*/
/*my solution***
        char ch = 'A';
        for (int i = 0; i < letter.length; i++) {
            letter[i] = ch++;
            //ch++;
        }
 */
        for(char i='A', j=0; i<='Z' && j<letters.length; i++, j++) {
            letters[j] = i;
        }

        // 2. Way
        char[] letters2 = new char[26];
        for (int i = 0, j='A'; i < letters2.length; i++, j++) {
            letters2[i] = (char) j;
        }

        
        System.out.println(Arrays.toString(letters)); // A ~ Z
        System.out.println(Arrays.toString(letters2)); // A ~ Z

        System.out.println("-----------------------------");

        char[] letters3 = new char[26];// Z - A
        char ch = 'Z';
        for (int i = 0; i < letters3.length; i++, ch--) {
            letters3[i] = ch;
        }

        System.out.println(letters3);//ZYXWVUTSRQPONMLKJIHGFEDCBA
        System.out.println(Arrays.toString(letters3));//[Z, Y, X, ...


    }

}
