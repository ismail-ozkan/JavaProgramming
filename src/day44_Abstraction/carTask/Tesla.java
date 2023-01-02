package day44_Abstraction.carTask;

public class Tesla extends Car implements AutoPark,AutoPilot{
    public Tesla( String model, int year, double price, String color) {
        super("Tesla", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getModel() + " " + getMake() + " is parking automatically");
    }

    @Override
    public void selfDrive() {
        System.out.println(getModel() + " " + getMake() + " is driving by self control");
    }

    @Override
    public void start() {

    }

    @Override
    public void drive() {

    }
}
