package MySelf;

public class AllMethodsILearned {

    public static void main(String[] args) {


        String str = "abcdEf";

        //1.charAt()    use with index(int)
        int a = str.charAt(0);
        System.out.println(a);//97

        //2.substirng() use with index(int) or use with ( starting index(int), ending index(int))
        String sub = str.substring(2);//"cdEf"
        String sub2 = str.substring(3,5);//"dE" 5.index is excluded

        //3.repeat() use with int for amunt of repeat
        String repeatTwo = str.repeat(2);//abcdEfabcdEf

        //4.isEmpty() --> no element
        //return boolean
        str.isEmpty();// false
        //5.isBlank() --> no element except blank
        //return boolean
        str.isBlank();//false

        //6.equals() -->boolean
        str.equals(sub);//false

        //7. equalsIngnoreCase
        str.equalsIgnoreCase(sub);//false

        //8.

        String str1 = "strstrstr";

        System.out.println(str1.replaceAll("s", "S"));


    }

}
