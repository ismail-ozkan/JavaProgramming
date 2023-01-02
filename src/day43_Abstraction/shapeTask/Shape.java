package day43_Abstraction.shapeTask;

public abstract class Shape {

    private String name;
    private final int numberOfSide;

    public Shape(String name, int numberOfSide) {
        setName(name);
        if (numberOfSide<=0){
            throw new RuntimeException("numberOfSide must be at least 1");
        } else {
            this.numberOfSide = numberOfSide;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfSide() {
        return numberOfSide;
    }

    public abstract double area();

    public abstract double perimeter();

}
