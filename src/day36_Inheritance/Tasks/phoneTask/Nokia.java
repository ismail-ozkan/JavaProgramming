package day36_Inheritance.Tasks.phoneTask;

public class Nokia extends Phone {

    public void setInfo(String brand, String model, String size, int price, String color){
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public void selfDefense(){
        System.out.println(brand + " " + model + " is defense itself");
    }

    public String toString() {
        return "Nokia{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
