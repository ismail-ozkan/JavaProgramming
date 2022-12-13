package day14_String;

public class StringMethods3_Substring {

    public static void main(String[] args) {
        // SUBSTRING method         -- small part of string
        // substring( beginning index, ending index )

        String word = "Cydeo School";
        //             01234...
        //String brand


        String brand = word.substring(0, 4);

        System.out.println("brand = " + brand);// Cyde ---> because ending index always is **EXCLUDED**


        // *****    ending index always is **EXCLUDED**   ******

        brand = word.substring(0, 4+1);
        System.out.println(brand);//Cydeo

        String str1 = word.substring(6);//ending index not required. it continues to end of the string

        System.out.println("str1 = " + str1);

        String str2 = word.substring(word.indexOf("S"), word.indexOf("l") + 1);

        System.out.println("str2 = " + str2);

        String word2 = "Java Programming Language";

        String s1;// "Java"
        String s2;// "Programming"
        String s3;// "Language"

        s1 = word2.substring(0, word2.indexOf(" "));
        //s2 = word2.substring(word2.indexOf("P"), (word2.indexOf("g ")+1));// or word2.indexOf("P"), (word2.lastIndexOf(" "))
        s2 = word2.substring(word2.indexOf(" ")+1, (word2.lastIndexOf(" ")+1));
        s3 = word2.substring(word2.lastIndexOf(" ")+1);// ending index is not required in here because it's last word

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


    }


}
