package MySelf.LeetCode;

public class LongestCommonPrefix {


    public static void main(String[] args) {

        String[] strs = {"flower","flow","flight"};

        System.out.println(longestCommonPrefix(strs));


    }

    public static String longestCommonPrefix(String[] strs){
        String result = "";

        if (strs[0]==null || strs.length==0){
            return "";
        }
        int i = 0;
        int min = strs[i].length();
        for (int j = 0; j < strs.length; j++) {
            if (strs[j].length()<min) {
                i = j;
            }
        }
        //strs[i] is smallest one
        int l = strs[i].length();
        for (int i1 = 0; i1 < strs.length; i1++) {
            if (i1 == i) continue;
            while (strs[i].length()!=0){
                if (strs[i].substring(0,l).equals(strs[i1].substring(0,l))) {
                    result = strs[i].substring(0,l);
                    break;
                }
                strs[i] = strs[i].substring(0,--l);
                if (l==0){
                    return "";
                }
            }
        }
        return result;
    }

}
