package day44_Abstraction.carTask;

public class BMW extends Car{
    public BMW( String model, int year, double price, String color) {
        super("BMW", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Say start BMW");
    }

    @Override
    public void drive() {
        System.out.println("Drive in the BMW road");
    }

}
