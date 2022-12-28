package Day42_Exceptions.taskShapeAgain;

public class Square extends  Shape{

    private double side;

    public Square(double side) {
        super("Square");
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
            if (side>=0) {
                this.side = side;
            }else {
                throw new RuntimeException("Invalid side: "+side+". Side cannot be negative.");
            }
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }
}
