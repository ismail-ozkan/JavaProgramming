package day32_Constructors;

public class ConstructorCalls {

    public ConstructorCalls(){
        System.out.println("Default Costructor");
    }

    public ConstructorCalls(int a){
        this();
        System.out.println("Contstructor with int argument");
    }

    public ConstructorCalls(String str){
        this(10);
        System.out.println("Contstructor with String argument");
    }


}
