package day44_Abstraction.deviceTask;

public abstract class Computer extends Device{

    public Computer(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
