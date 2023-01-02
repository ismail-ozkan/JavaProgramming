package day44_Abstraction.carTask;

public class Nio extends Car implements AutoPark, AutoPilot{
    public Nio( String model, int year, double price, String color) {
        super("Nio", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getModel() + " " + getMake() + " is parking automatically");
    }

    @Override
    public void selfDrive() {

    }

    @Override
    public void start() {

    }

    @Override
    public void drive() {

    }
}
