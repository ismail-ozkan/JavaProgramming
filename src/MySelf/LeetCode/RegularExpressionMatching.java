package MySelf.LeetCode;

public class RegularExpressionMatching {

    public static void main(String[] args) {

        String s = "abdcef";
        String p = "a**.e*";
        /*boolean result = false;
        char tempCh = ' ';
        //first condition: length must be equal
        if (s.length()==p.length()&&p.charAt(0)!='*'){
            for (int i = 0; i < s.length()-1; i++) {
                //search which character is "*" or "."
                if (p.charAt(i)=='*'&&p.charAt(0)!='*') {
                    tempCh = s.charAt(i);
                    if (p.charAt(i+1)=='*'){
                        if (s.charAt(i+1)<s.charAt(i)) {
                            result = false;
                            break;
                        }
                    }
                } else if (p.charAt(i)=='.') {
                    if (p.charAt(i+1)=='*'){
                        result = s.charAt(i+1)>=s.charAt(i);
                    }else {
                        continue;
                    }

                } else {
                    if (p.charAt(i)==s.charAt(i)) {
                        result =true;
                       if (p.charAt(i+1)=='*'){
                           if (s.charAt(i+1)>=s.charAt(i)) {
                               result = true;
                               continue;
                           } else {
                                result = false;
                                break;
                           }
                       }
                    } else {
                        result = false;
                        break;
                    }
                }


            }



        }else {
            result = false;
        }

        System.out.println(result);*/


    }

    public boolean isMatch(String s, String p) {
        boolean result = false;
        char tempCh = ' ';
        //first condition: length must be equal
        if (s.length()==p.length()&&p.charAt(0)!='*'){
            for (int i = 0; i < s.length()-1; i++) {
                //search which character is "*" or "."
                if (p.charAt(i)=='*'&&p.charAt(0)!='*') {
                    tempCh = s.charAt(i);
                    if (p.charAt(i+1)=='*'){
                        if (s.charAt(i+1)<s.charAt(i)) {
                            result = false;
                            break;
                        }
                    }
                } else if (p.charAt(i)=='.') {
                    if (p.charAt(i+1)=='*'){
                        result = s.charAt(i+1)>=s.charAt(i);
                    }else {
                        continue;
                    }

                } else {
                    if (p.charAt(i)==s.charAt(i)) {
                        result =true;
                        if (p.charAt(i+1)=='*'){
                            if (s.charAt(i+1)>=s.charAt(i)) {
                                result = true;
                                continue;
                            } else {
                                result = false;
                                break;
                            }
                        }
                    } else {
                        result = false;
                        break;
                    }
                }


            }



        }else {
            result = false;
        }

        return result;
    }

}
/*
Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:

'.' Matches any single character.
'*' Matches zero or more of the preceding element.
The matching should cover the entire input string (not partial).

https://leetcode.com/problems/regular-expression-matching/

1 <= s.length <= 20
1 <= p.length <= 30
s contains only lowercase English letters.
p contains only lowercase English letters, '.', and '*'.
It is guaranteed for each appearance of the character '*', there will be a previous valid character to match.
 */