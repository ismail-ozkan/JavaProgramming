package day36_Inheritance.Tasks.phoneTask;

public class Samsung extends Phone{

    //public static String brand = "Samsung";

    public void setInfo(String brand, String model, String size, int price, String color){
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public void freeze(){
        System.out.println(brand + " " + model + " is freezing");
    }

    public String toString() {
        return "Samsung{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
