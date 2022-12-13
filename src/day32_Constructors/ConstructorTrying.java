package day32_Constructors;

public class ConstructorTrying {
    public static void main(String[] args) {

        new ConstructorCalls();

        System.out.println("--------------------------------------");

        ConstructorCalls object2 = new ConstructorCalls(10);

        System.out.println("--------------------------------------");

        ConstructorCalls object3 = new ConstructorCalls("ABC");

        System.out.println("--------------------------------------");

        //System.out.println(object1);
        System.out.println(object2);
        System.out.println(object3);

    }

}
