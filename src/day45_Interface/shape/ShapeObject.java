package day45_Interface.shape;

public class ShapeObject {

    public static void main(String[] args) {

        Circle circle = new Circle(15);

        System.out.println(circle);

        Cylinder cylinder = new Cylinder(12, 3);

        // System.out.println(cylinder.volumme());

        System.out.println(cylinder.pi);
        double d = Volume.pi;

        System.out.println(cylinder);
    }

}
