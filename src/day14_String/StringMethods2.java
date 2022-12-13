package day14_String;

public class StringMethods2 {

    public static void main(String[] args) {

         String str = "Java is fun, I love learning Java";

         String str2 = str.replace("Java", "Python");

         System.out.println("str = " + str);
         System.out.println("str2 = " + str2);

         String email = "johnsmith@yahoo.com";
         String email2 = email.replace("yahoo", "gmail");

        System.out.println("email = " + email);
        System.out.println("email2 = " + email2);


        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python Python";// for removing Pythons

        String sentence2 = sentence.replace("Python", "").replace("   ","  ").replace("  ", " ");
        System.out.println("sentence2 = " + sentence2);

        String trySentence = "aaaa aaaa aaaa aaa";
        String trySentence2 = trySentence.replace("aa", "a");
        System.out.println("trySentence2 = " + trySentence2);


        String trySentence3 = trySentence.replace("aaa", "aa").replace("aa","a").replace("aa","a").replace("aa","a").replace("aa","a");
        System.out.println("trySentence3 = " + trySentence3);

        String s = "Dog Dog Dog Dog Dog Dog";

        s = s.replace("Dog", "Cat");// if we don't need s valuable anymore, we reassign to s a new data
        System.out.println("s = " + s);


        String s2 = "C# is fun, C# is cool";// if we want to replace only 2. "C#" then we use the following way
        s2 = s2.replace(" C#", " Java");// or s2.replace("C# is c", "Java is c");
        System.out.println("s2 = " + s2);


        String s3 = "Java";

        s3 = s3.replace("a", "e");// Jeve

        System.out.println("s3 = " + s3);

        System.out.println("---------------------------------");
        //
        String result = "Java Java Java";

        result = result.replaceFirst("Java", "Python");//from left to right first Java replace
        System.out.println("result = " + result);

        String result2 = "C# is fun, C# is cool";
        result2 = result2.replaceFirst("C#", "Java").replaceFirst("C#", "Java");
        System.out.println("result2 = " + result2);

        String result3 = "Java";
        result3 = result3.replaceFirst("a", "o");
        //result3 = result3.replaceFirst("va", "vo");//for changing second a
        System.out.println("result3 = " + result3);


        /* it doesn't work
        String resultTry = "abcde abcde";
        resultTry = resultTry.replaceFirst(resultTry.charAt(0),"e");
        */





    }

}
