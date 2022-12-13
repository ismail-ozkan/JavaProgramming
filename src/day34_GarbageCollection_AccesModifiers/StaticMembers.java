package day34_GarbageCollection_AccesModifiers;

public class StaticMembers {

    class class1{ // it has modifier and classname. default access modifier .
        //this is a inner-nested class
    }


    public static int num = 100;

    public static void method(){

    }

    static {

    }






}


class A{// outer class

    static class B{//inner class
            // pre-condition for being a static class is being an inner class
        public static void method1(){

        }

    }

}

class C{
    public static void main(String[] args) {

        A.B.method1();

    }
}
