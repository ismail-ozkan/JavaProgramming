package day44_Abstraction.deviceTask;

public abstract class Phone extends Device{
    public Phone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }
    public void call(long phoneNumber){

    }
    public void text(long phoneNumber){

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
