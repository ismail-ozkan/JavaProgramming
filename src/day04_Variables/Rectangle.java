package day04_Variables;

public class Rectangle {

    public static void main(String[] args) {
        // lenght, width, perimeter, area
        double length = 3.5;
        double width = 4.5;
        double areaOfRectangle = length * width;
        double perimeterOfRectangle = 2 * (length + width);

        System.out.println("length = " + length);
        System.out.println("width = " + width);
        System.out.println("perimeterOfRectangle = " + perimeterOfRectangle);
        System.out.println("areaOfRectangle = " + areaOfRectangle);

    }
}
/*
2. Create a class named Rectangle, write a program that can calculate the area & perimeter of any given Rectangle
						length
						width
						area = length * width
						perimeter =  2 * (length + width)
 */