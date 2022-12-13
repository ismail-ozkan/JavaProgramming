package day04_Variables;

public class Square {

    public static void main(String[] args) {

        double lenghtOfSide = 15.3;
        int numberOfSide = 4;
        double area = lenghtOfSide * lenghtOfSide;
        double perimeter = lenghtOfSide * numberOfSide;

        System.out.println("lenghtOfSide = " + lenghtOfSide);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
    }
}
/*
1. Create a class named Square, write a program that can calculate the area & perimeter of any given square
						side (3.5)
						area = side * side;
						perimeter = 4 * side
 */