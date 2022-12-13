package day21_ForEachLoop.Tasks;

public class T4 {
/*
4. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
 */
    public static void main(String[] args) {

        String[] str = {"anna", "levıl", "Java"};
        int count = 0;
        for (String s : str) {
            boolean controler1 = true;
            boolean controler2 = false;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i)==s.charAt(s.length()-1-i)) controler2=true;
                else controler2=false;
                controler1 = controler1 && controler2;
            }
            if (controler1==true) count++;
        }

        System.out.println(count);
        /*
        String[] words =  {"anna", "level", "Java"};

        int count = 0;

        for (String each : words) {
            String reverse ="";
            for (int i = each.length()-1; i >= 0 ; i--) {
                reverse += each.charAt(i);
            }

            if(each.equalsIgnoreCase(reverse)){
                count++;
            }
        }

        System.out.println(count);
         */

    }
}
