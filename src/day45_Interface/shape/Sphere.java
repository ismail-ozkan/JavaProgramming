package day45_Interface.shape;

public class Sphere extends Shape implements Volume{

    private double radius;

    public Sphere( double radius) {
        super("Sphere");
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius<0) {
            throw new RuntimeException("Invalid radius: "+radius);
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2*pi*radius*radius;
    }

    @Override
    public double perimeter() {
        return 2/3*2*pi*radius;
    }

    @Override
    public double volume() {
        return 4/3*pi*radius*radius;
    }

    @Override
    public String toString() {
        return "Sphere{" +
                super.toString()+
                "radius=" + radius +
                '}';
    }
}
