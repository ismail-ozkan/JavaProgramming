package day45_Interface.shape;

public class Rectangle extends Shape{

    private double length, width;

    public double getLength() {
        return length;
    }

    public Rectangle(String name, double length, double width) {
        super(name);
        setLength(length);
        setWidth(width);
    }

    public void setLength(double length) {
        if (length<0) {
            throw new RuntimeException("Invalid length");
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }



    @Override
    public double area() {
        return length*width;
    }

    @Override
    public double perimeter() {
        return 2*(length+width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                super.toString()+
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
