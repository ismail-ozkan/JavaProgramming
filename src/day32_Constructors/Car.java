package day32_Constructors;

public class Car {

    public String make, model, color;
    public int year;
    public double price;

    public Car(String make) {
        this.make = make;
    }

    public Car(String make, String model) {
        this(make);
        this.model = model;
    }

    public Car(String make, String model, int year) {
        this(make, model);
        this.year = year;
    }

    public Car(String make, String model, int year, double price) {
        this(make, model, year);
        this.price = price;
    }

    public Car(String make, String model, String color, int year, double price) {
        this(make, model, year, price);
        this.color = color;
    }

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
