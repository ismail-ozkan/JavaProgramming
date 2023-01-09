package day45_Interface.shape;

public class Cylinder extends Shape implements Volume{

    private double height;
    private double radius;

    //public static double pi = 3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            throw new RuntimeException("Invalid radius: "+radius);
        }
        this.radius = radius;
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height<0) {
            throw new RuntimeException("Invalid height");
        }
        this.height = height;
    }

    public Cylinder(double height, double radius) {
        super("Cylinder");
        setHeight(height);
        setRadius(radius);
    }

    @Override
    public double area() {
        return (2*pi*radius*radius)+(2*pi*radius*height);
    }

    @Override
    public double perimeter() {
        return 2*pi*radius*height;
    }

    @Override
    public double volume() {
        return 2*pi*radius*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                super.toString()+
                "height=" + height +
                ", radius=" + radius +
                '}';
    }
}
