package day44_Abstraction.carTask;

public abstract class Car {

    private final String make;
    private final String model;
    private final int year;
    private double price;
    private String color;

    public Car(String make, String model, int year, double price, String color) {
        if (make.isEmpty()||make==null){
            throw new RuntimeException("Invalid make");
        }
        this.make = make;
        if (model.isEmpty()||model==null){
            throw new RuntimeException("Invalid make");
        }
        this.model = model;
        if (year<1886){
            throw new RuntimeException("Invalid year");
        }
        this.year = year;
        setPrice(price);
        setColor(color);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setPrice(double price){
        if (price<0){
            throw new RuntimeException("Invalid price");
        }
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void start();
    public abstract void drive();

    public void stop(){
        System.out.println(getMake() + " " + getModel() + " is stoped");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public static void staticTry(){
        System.out.println("This is static method");
    }
}
