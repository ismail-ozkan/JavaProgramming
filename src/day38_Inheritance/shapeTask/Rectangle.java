package day38_Inheritance.shapeTask;

public class Rectangle extends Shape{

    public double length, width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }
    public double area(){
        return length * width;
    }

    public double perimeter(){
        return 2 * (length+width);
    }
    @Override
    public String toString() {
        return "Square{" +
                "name=" + name +
                "length=" + length +
                "width=" + width +
                "area=" + area() +
                "perimeter=" + perimeter() +
                '}';
    }
}
