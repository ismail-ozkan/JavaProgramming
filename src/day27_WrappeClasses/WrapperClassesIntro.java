package day27_WrappeClasses;

public class WrapperClassesIntro {

    public static void main(String[] args) {

        int num1 = 200;

        Integer n1 = num1; // autoboxing, executed implicitly
        //Long n2 = num1;  xxx

        int num2 = n1; // unboxing, explicitly

        System.out.println("---------------------------------");

        Integer integerValue = 100;

        long longValue = integerValue;

        System.out.println("---------------------------------");

        int num3 = 200;

        //Long l2 = num3; XXX
        Integer num4 = num3; // autoboxing

        System.out.println("---------------------------------");

        Byte b1 = 25;
        byte a1 = b1;
        short a2 = b1;
        int a3 = b1;
        long a4 = b1;

        System.out.println("---------------------------------");

        Integer z = 200;
        Integer y = z;

        System.out.println("---------------------------------");

        int[] numbers1 = {1,2,3,4,5};
        Integer[] numbers2 = {1,2,3,4,5};







    }

}
