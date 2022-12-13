package day15_ForLoop;

public class StringMethods {

    public static void main(String[] args) {
        // isEmpty() method

        String str = "";

        boolean r = str.isEmpty();

        System.out.println(r);// true ---- " " false

        //isBlank() method

        String str1 = "             ";
        String str11 = "";
        boolean r1 = str1.isBlank();
        System.out.println(r1);// true
        System.out.println(str11.isBlank());// true


        String str2 = "Cydeo      ";
        System.out.println(str2.isBlank());// false

        System.out.println("-------------------");
// equlas() and equalsIgnoreCase() Methods
        String s1 = "CYDEO";
        String s2 = "Cydeo";

        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equalsIgnoreCase(s2));//true

        System.out.println("yEs".equals("yes"));//false
        System.out.println("yEs".equalsIgnoreCase("yes"));//false

        System.out.println("--------------------------");

        String sentence = " My favorite programming language is Java";

        boolean hasCSharp = sentence.contains("C#");
        boolean hasJava = sentence.contains("Java");
        boolean hasJava2 = sentence.contains("java");
        boolean hasJava3 = sentence.toLowerCase().contains("java");
        // java read the code from left------->>>>>to right, so first return lowercase after if it compare or not
        boolean r3 = sentence.contains("java") || sentence.contains("Java");//what if "JaVA" then it is false!!

        System.out.println("hasCSharp = " + hasCSharp);//false
        System.out.println("hasJava = " + hasJava);
        System.out.println("hasJava2 = " + hasJava2);
        System.out.println("hasJava3 = " + hasJava3);

        System.out.println("--------------------------------");

        String input1 = "I love Java";
        String input2 = "Java";
        String input3 = "I love jAva";


        System.out.println(input1.equals(input2));//false
        System.out.println(input1.equalsIgnoreCase(input2));// false
        System.out.println(input1.contains(input2));//true

        System.out.println(input3.toLowerCase().contains("java"));
        System.out.println(input3.toUpperCase().contains("JAVA"));

        System.out.println("--------------------------");

        String a = "Wooden Spoon";

        boolean x = a.startsWith("Woo");// ture

        boolean y = a.startsWith("oo");//false
        boolean y1 = a.toLowerCase().startsWith("woo");//true

        boolean z = a.endsWith("on");//true

        boolean t = a.endsWith("oo");//false

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("y1 = " + y1);
        System.out.println("z = " + z);
        System.out.println("t = " + t);


    }

}
