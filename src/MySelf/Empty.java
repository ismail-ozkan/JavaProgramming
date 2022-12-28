package MySelf;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class Empty {

    public void instanceMeth(){
        System.out.println("Instance meth");
    }
    public static void staticMeth(){
        System.out.println("Static");
    }

    static {

        System.out.println("Static block");

    }
    public static void main(String[] args) {

        Empty empty = new Empty();

        empty.instanceMeth();

        Empty.staticMeth();

    }



}
