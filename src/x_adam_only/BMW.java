package x_adam_only;

import java.time.LocalDate;

public class BMW {

    public String brand, model, color;
    public double price, milage;
    public int year;
    public LocalDate DOfB;


    public BMW(String brand, String model, String color, double price, double milage, int year, LocalDate DOfB) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.milage = milage;
        this.year = year;
        this.DOfB = DOfB;
    }

    public String getbrandName() {
        return brand+" "+model;
    }

    public String toString() {
        return "BMW{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", milage=" + milage +
                ", year=" + year +
                ", DOfB=" + DOfB +
                '}';
    }
}
