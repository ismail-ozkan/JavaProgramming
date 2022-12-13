package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {

        // age: 38 years old
        byte age = 38;

        // weight: 160 pounds
        // byte weight = 160;  160 is out of byte' range(-128 to 127)
        //   byte num = -129;  129 is out of byte' range(-128 to 127)

        short weight = 160;  // 160 is within the range of short(-32.768 to 32.767)

        // salary: 100000$
       // short salary = 100000; //100000 is out of short' range
        int salary = 100000; // int is preferred data type for integer numbers
        // we can only use _(underscore sign) for readability. not can use any sign or character
        int salary_2 = 100_000;

        // int asset = 3_333_333_333; out of int' range

        long asses = 3_333_333_333L; // L or l, we have to use it in the end of number.


        // tax: 0.26
        float tax2 = 0.25F; // F or f, we have to use for using float
        float fExmp = 0.123_232_123_4f;
        float fExmp2 = 0.1_232_321_23_4f;
        System.out.println("fExmp = " + fExmp);
        System.out.println("fExmp2 = " + fExmp2);
        double tax = 0.26;  // we dont need any char for using double

        // char variable using for only 1 character.
        // # equal 35 in ascii table
        char ch1 = '#';
        System.out.println("ch1 = " + ch1);

        char ch2 = 35;
        System.out.println("ch2 = " + ch2);

        char ch3 = 25000;
        System.out.println("ch3 = " + ch3);

        char gender = 'M';// in driver licence

        char yesNo = 'Y';

        boolean isEmployed = false;
        boolean isMaried = true;

        boolean result = 100 > 300;
        System.out.println("result = " + result);//output: false

        // String data type , we use it for sequence of character  (String of text), "we write string text here"
        String name = "Wooden Spoon";
        String city = "Kocaeli";
        String region = "Marmara";
        String Country = "Turkey";
        System.out.println("name = " + name);
        System.out.println("city = " + city);
        System.out.println("region = " + region);
        System.out.println("Country = " + Country);

        // (1213)-(123)-(123) for like that type of data, we use String data type


        String first_name$ = "muhtar";
        int num1 = 100;

        // int private = 300; it cant use, because it's reserved word by java.

        

    }

}
