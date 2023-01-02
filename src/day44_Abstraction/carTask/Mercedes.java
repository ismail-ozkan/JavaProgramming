package day44_Abstraction.carTask;

public class Mercedes extends Car implements AutoPark{

    public Mercedes( String model, int year, double price, String color) {
        super("Mercedes", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getModel() + " " + getMake() + " is parking automatically");
    }

    @Override
    public void start() {

    }

    @Override
    public void drive() {

    }
}
