package day43_Abstraction.shapeTask;


public final class Rectangle extends Shape{

    private double weight;
    private double length;

    public Rectangle(String name, int numberOfSide) {
        super(name, numberOfSide);
    }


    @Override
    public double area() {
        return weight*length;
    }

    @Override
    public double perimeter() {
        return 2*(weight+length);
    }
}
