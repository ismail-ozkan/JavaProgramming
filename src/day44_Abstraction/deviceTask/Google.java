package day44_Abstraction.deviceTask;

public class Google  extends Phone implements AndroidApp{

    public Google(String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super("Google", model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void downloadApp() {

    }
}
