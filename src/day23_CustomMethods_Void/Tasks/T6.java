package day23_CustomMethods_Void.Tasks;

public class T6 {
//6. create a method that can calculate the area of a circle

    public static void main(String[] args) {

        int radius = 8;
        areaOfCircle(radius);

    }

    public static void areaOfCircle(int radius) {

        double pi = 3.14;
        double area = pi * radius * radius;

        System.out.println("Area of circle is: "+area);

    }
}
