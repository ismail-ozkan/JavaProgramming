package day44_Abstraction.carTask;

public class Honda extends Car{
    public Honda( String model, int year, double price, String color) {
        super("Honda", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Start say honda");
    }

    @Override
    public void drive() {
        System.out.println("drive in honda road");
    }

}
