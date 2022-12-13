package x_adam_only.week08;

public class LongestPalindrome {

    public static void main(String[] args) {


        String[] str = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};

        String longOne = "";
        for (int i = 0; i < str.length; i++) {
            for (String each : str) {
                for (int j = 0, c = each.length()-1; j < each.length(); j++,c--) {
                    if (each.charAt(j)!=each.charAt(c)) {
                        continue;
                    }
                }
                if (each.charAt(0)==each.charAt(each.length()-1)&& each.length()>longOne.length()) {
                    longOne = each;
                }
            }
        }
        System.out.println(longOne);

    }

}
/*
Task 4 :  For Each - Nested For

    		Longest Palindrome

       		 Given a String array. Find the longest Palindrome String in your array.
			        Ex:
			        Input: ["java", "longer word", "civic" "apple", "racecar", "mom", "anna"] Output: racecar
			        Ex:
			        Input: ["abc", "dna", "kevin", "joe", "lamp"]
			        Output: No palindrome
 */