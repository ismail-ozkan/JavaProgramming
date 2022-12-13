package day36_Inheritance.Tasks.phoneTask;

public class IPhone extends Phone{

    public static String brand = "Iphone";

    public void setInfo(/*String brand,*/ String model, String size, int price, String color){
        //this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public void faceTime(long phoneNumber){
        System.out.println(brand + " " + model + " use faceTime with " + phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(brand + " " + model + " use faceTime with " + email);
    }

    public String toString() {
        return "IPhone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
