package day45_Interface.shape;

public abstract class Shape {

    // common features only
    private final String name;

    public Shape(String name) {
        if (name.isBlank()||name.isEmpty()) {

        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double area();//don't give any implementation

    public abstract double perimeter();

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
