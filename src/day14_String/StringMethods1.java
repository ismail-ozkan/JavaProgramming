package day14_String;

public class StringMethods1 {

    public static void main(String[] args) {

        String str1 = "    batch     25       ";
        str1 = str1.trim();

        System.out.println(str1); //batch    25
        // return new String without unused(right-left) (white)spaces

        System.out.println("--------------------------");

        String str2 = "Cydeo School";

        int n1 =str2.indexOf("h");
        System.out.println("n1 = " + n1);

        int n2 = str2.indexOf("o");
        System.out.println("n2 = " + n2); // 4

        int n21 = str2.indexOf("ool");
        System.out.println("n21 = " + n21); // 9

        String str3 = "Java Programming language";
        //---------->------>------>-------->------>left to right

        int n3 = str3.indexOf("a");
        System.out.println("n3 = " + n3);//1

        int n31 = str3.indexOf("a ");
        System.out.println("n31 = " + n31);//3

        int n32 = str3.indexOf("amm");
        System.out.println("n32 = " + n32);//10

        int n34 = str3.indexOf("an");
        System.out.println("n34 = " + n34);//18

        int n4 = str3.indexOf("g");// for find out first "g" character.
        System.out.println("n4 = " + n4);//8

        int n41 = str3.indexOf("g ");
        System.out.println("n41 = " + n41);//15

        int n42 = str3.indexOf("gua");
        System.out.println("n42 = " + n42);//20
 //**********
        int n5 = str3.lastIndexOf("g");// from right to left *****
        System.out.println("n5 = " + n5);// 23

        int n51 = str3.indexOf("g");// from left to right
        System.out.println("n51 = " + n51);//8

        System.out.println("----------------------");

        String s = "Java Nova Cava Wawa orange";

        int firstA = s.indexOf("a");// from left to right
        int lastA = s.lastIndexOf("a");//right to left
        int secondA = s.indexOf("a ");
        int thirdA = s.indexOf("a C");
        int fourthA = s.indexOf("ava W");
        int fourthA2 = s.lastIndexOf("av");//from right to left
        int fourthA3 = s.indexOf("Ca") + 1;//******
        int fifthA = s.lastIndexOf("a W");
        int fifthA2 = s.lastIndexOf("va") + 1;//******
        int sixthA= s.lastIndexOf("aw");
        int seventhA = s.indexOf("a o");
        int seventhA2 = s.lastIndexOf("a ");



        System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("fourthA = " + fourthA);
        System.out.println("fourthA2 = " + fourthA2);
        System.out.println("fourthA3 = " + fourthA3);
        System.out.println("fifthA = " + fifthA);
        System.out.println("fifthA2 = " + fifthA2);
        System.out.println("sixthA = " + sixthA);
        System.out.println("seventhA = " + seventhA);
        System.out.println("seventhA2 = " + seventhA2);

    }

}
