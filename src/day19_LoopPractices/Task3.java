package Day19_LoopPractices;

public class Task3 {
/*
3. Write a program that can display all the characters that appeared twice in the string.
 */
    public static void main(String[] args) {

        String str = "aaaabcddeeeeffghh";
        String res = "";

        for (int i = 0; i < str.length(); i++) {
            char ch1 = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                char ch2 = str.charAt(j);
                if (ch1==ch2) {
                    count++;
                    }
                }
            if (count==2&&!(res.contains(""+ch1))) {
                res+=ch1;
            }
        }
        System.out.println(res);
    }

}
