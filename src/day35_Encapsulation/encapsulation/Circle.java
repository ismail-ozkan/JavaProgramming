package day35_Encapsulation.encapsulation;

public class Circle {

    private double radius;

    public double pi;

    public void setRadius(double radius){
        if (radius<=0) {
            return;
        }
        this.radius = radius;
    }
    public Circle(double radius){
        setRadius(radius);
        pi = 3.14;
    }

    /* Constructor shortcut create like that:
    public Circle(double radius) {
        this.radius = radius;
    }*/

    public double calcArea(){
        return pi*radius*radius;
    }
    public double calcPerimeter(){
        return 2*pi*radius;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi=" + pi +
                ", Area=" + calcArea() +
                ", Perimeter=" + calcPerimeter() +
                '}';
    }
}
