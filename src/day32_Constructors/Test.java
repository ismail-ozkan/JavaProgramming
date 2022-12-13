package day32_Constructors;

public class Test {

    public Test(){ // A
        System.out.println("A");
    }
    public Test(int a){ // A , B
        this();
        System.out.println("B");
    }
    public Test(double d){ // A , B , C
        this(2);
        System.out.println("C");
    }
    public Test(String str){// A , B , C , D
        this(2.3);
        System.out.println("D");
    }

    public static void main(String[] args) {


        new Test(10);


    }

}
