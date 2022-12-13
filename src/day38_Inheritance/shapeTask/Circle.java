package day38_Inheritance.shapeTask;

public class Circle extends Shape{

    public double radius;
    public static double pi = 3.14;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double area() {
        return  pi * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * pi * radius;
    }

    @Override
    public String toString() {
        return super.toString()+
                "radius: "+radius+ '\'' +
                "pi: "+pi;

    }
}
