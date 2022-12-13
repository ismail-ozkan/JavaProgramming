package day04_Variables;

public class Circle {

    public static void main(String[] args) {

        double radius = 13;
        double PI = 3.14;
        double diameter = 2 * radius;
        double areaOfCircle = radius * radius * PI;
        // double perimeterOfCircle = 2 * radius * PI;
        double perimeterOfCircle = diameter * PI;

        System.out.println("radius = " + radius);
        System.out.println("diameter = " + diameter);
        System.out.println("areaOfCircle = " + areaOfCircle);
        System.out.println("perimeterOfCircle = " + perimeterOfCircle);

    }
}
/*
3. Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle
			PI, radius, diameter, area, perimeter

					Hints: 	PI = 3.14
							area = radius * radius * PI
							Perimeter = 2 * radius * PI
 */