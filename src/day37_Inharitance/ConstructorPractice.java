package day37_Inharitance;

class A{


    public A(int a){
        System.out.println("A");
    }

}

class B extends A{

    public B(){
        super(9);
        // if SuperClass has no constructor(so has a default constructor)
        // then here super(); is created implicitly
        System.out.println("B");
    }

}

public class ConstructorPractice {

    public static void main(String[] args) {

        B obj = new B();


    }

}
