package day44_Abstraction.carTask;

public class Audi extends Car implements AutoPark{
    public Audi( String model, int year, double price, String color) {
        super("Audi", model, year, price, color);
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
