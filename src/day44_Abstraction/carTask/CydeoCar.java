package day44_Abstraction.carTask;

public class CydeoCar extends Car implements AutoPark,AutoPilot,Flyable{
    public CydeoCar( String model, int year, double price, String color) {
        super("CydeoCar", model, year, price, color);
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

    @Override
    public void fly() {
        System.out.println(getModel() + " " + getMake() + " is flying");
    }
}
