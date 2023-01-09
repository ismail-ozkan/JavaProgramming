package day44_Abstraction.deviceTask;

public class Iphone extends Phone implements AppleApp{
    public Iphone(String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super("Iphone", model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void downloadApp() {

    }
}
