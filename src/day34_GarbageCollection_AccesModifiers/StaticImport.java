package day34_GarbageCollection_AccesModifiers;

//import day34_GarbageCollection_AccesModifiers.Circle.*;
// we use .* for import all members of the class without static keyword

import static day34_GarbageCollection_AccesModifiers.Circle.*;

public class StaticImport {

    public static void main(String[] args) {

        System.out.println(pi);//we dont call this static variable with not-static import
                                //but we can call it with static import without using Classname.variableName
        System.out.println(Circle.pi);
        Circle.method1();


    }

}
