package day39_Recap.deviceTask;

public class Device {

    private String brand, model;
    private double price;
    private static boolean hasBattery= true, hasPowerButton= true;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand.isBlank()||brand.isEmpty()||brand==null) {
            System.out.println("Invalid brand");
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model.isBlank()||model.isEmpty()||model==null) {
            System.out.println("Invalid model");
            System.exit(1);
        }
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<=0) {
            System.out.println("Invalid price");
            System.exit(1);
        }
        this.price = price;
    }

    public Device(String brand, String model, double price) {
        setBrand(brand);
        setModel(model);
        setPrice(price);
    }

    public void turnOn(){
        System.out.println(getBrand() + " " + getModel() + " is turning on");
    }
    public void turnOff(){
        System.out.println(getBrand() + " " + getModel() + " is turning off");
    }

    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
