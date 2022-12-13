package x_adam_only.week08;

public class LongestRepetitive {

    public static void main(String[] args) {

        String str = "abcdefabcdef";
        String result = "";
        String repeatedSub = "";

        //find repeated part,
        for (int i = 0; i < str.length(); i++) {

            if (str.substring(0,i).equals(str.substring(i))) {
                repeatedSub = str.substring(0,i);
            }
            while (!str.isEmpty()){
                str.replaceFirst(repeatedSub,"");
                if (!str.contains(repeatedSub)&&!str.isEmpty()){
                    result = "There is no repetitive substring";
                    break;
                }
            }
            if (str.isEmpty()){
                result = repeatedSub;
            }

        }
        System.out.println(result);


    }

}
/*
Task 5 : Longest Repetitive Substring -- Real Interview Task


    		Write a program if some substring K that can be repeated N>1 times to produce the input string exactly as it appears.
    		Your program should return the longest substring K, and
    		if there is none it should be return "There is no repetitive substring"

    		For Example is str ="abcababcababcab"  			   output should be abcab
    					   str ="abcdefabcdef"     			   output should be abcdef
    					   str ="abcdefabcdefabcdefabcdef"     output should be abcdefabcdef
    					   str ="abcdefxabcdef"				   output should be "There is no repetitive substring"
 */