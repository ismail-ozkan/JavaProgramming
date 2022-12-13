package day25_CustomMethod_Overloading;

import utilities.StringUtility;

public class Test {

    public static void main(String[] args) {

        String str = "Java Programming Language";

        StringUtility.printEachChar(str);

        System.out.println("-------------------------------------");

        String s1 = "Wooden Spoon";

        System.out.println(StringUtility.reverse(s1));

        String word = "Java";

        boolean palindrome = StringUtility.isPalindrome(word);

        System.out.println("palindrome = " + palindrome);

        System.out.println("-----------------------------------------");

        String[] names = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};

        int count=0;

        for (String each : names) {
            if(StringUtility.isPalindrome(each)){
                count++;
            }
        }

        System.out.println(count);

        String s2 = "aaaabbbbccccddddd";

        System.out.println(StringUtility.removeDuplicates(s2));


    }

}
