package day34_GarbageCollection_AccesModifiers;

import day34_GarbageCollection_AccesModifiers.Circle;

import static utilities.MathUtility.*;
public class Test {

    public static void main(String[] args) {

        System.out.println(Circle.pi);
        System.out.println(Circle.name);
        System.out.println(Circle.numbers);

        System.out.println("--------------------------------");

        //find the sum of 10,20

        int r1 = sum(10,20);

        //find the sum of 100,200

        int r2 = sum(100,200);

        int r3 = subtract(200,56);

        int r4 = max(200,56);

        System.out.println("--------------------------------");


    }

}
