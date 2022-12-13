package x_adam_only.week09;

public class FrontBack {

    public static void main(String[] args) {

        System.out.println(frontBack("abcdefgh"));
    }

    public static String frontBack(String str) {

        String result = "";
        String[] arr = new String[str.length()];


        for (int i = 0; i < arr.length; i++) {
            if (i==0){
                arr[arr.length-1] = str.charAt(i)+"";
            } else if (i == arr.length-1){
                arr[0] = str.charAt(arr.length-1)+"";
            } else {
                arr[i] = str.charAt(i)+"";
            }
        }
        for (String s : arr) {
            result+=s;
        }
        return result;

    }

}
/*
Task 6 : Write a method that return a new string where the first and last chars have been exchanged.


             frontBack("code") → "eodc"
             frontBack("a") → "a"
             frontBack("ab") → "ba"
 */