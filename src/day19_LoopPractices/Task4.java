package Day19_LoopPractices;

public class Task4 {
/*
4. Write a program that can return the index number of the first unique character.
 */
    public static void main(String[] args) {

        String str = "aaabbcddeeef";
        String res = "";

        for (int i = 0; i < str.length(); i++) {
            char ch1 = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                char ch2 = str.charAt(j);
                if (ch1==ch2) count++;
            }
            if (count==1) {
                res+=ch1;
                break;
            }
        }
        System.out.println(res);

    }
}
