package day23_CustomMethods_Void.Tasks;

import java.util.Arrays;

public class T17 {
/*
7. create a method that can check if two strings are anagram
    		ex:
    			anagram("silent", "listen")


			output:
				silent and listen are anagram
 */
    public static void main(String[] args) {

        isAnagram("ismail","smilia");

    }

    public static void isAnagram(String str1, String str2) {

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1,arr2)){
            System.out.println(str1 + " and " + str2 + " are anagram");
        }else {
            System.out.println(str1 + " and " + str2 + " are not anagram");
        }


    }


}
