package day53_Last;

import static MySelf.Family.*;
import MySelf.Family;

import java.util.ArrayList;

public class Trying {

    public static void main(String[] args) {

        Family m1 = new Family("iso",32);

        Family.lastName();
        System.out.println(Family.lastName2());
        for (Integer each : listOf1to100) {
            if (each%4==0) {
                System.out.print(each+" ");
            }
        }
        System.out.println();
        m1.ageOfMember();

        //Family.usingPrivate();

    }

}

