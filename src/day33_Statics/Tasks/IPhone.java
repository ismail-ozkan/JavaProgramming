package day33_Statics.Tasks;

public class IPhone {

    public String model;
    public int price;
    public String color;
    public String size;
    public static String brand = "Iphone";
    public static String OS = "iOS";
    public static String madeIn = "China";

    public IPhone(String model, int price, String color, String size) {
        this.model = model;
        this.price = price;
        this.color = color;
        this.size = size;
    }

    public void faceTime(long phoneNumber){

    }
    public void faceTime(String email){

    }
    public void call(long phoneNumber){

    }
    public void call(String email){

    }
    public void text(long phoneNumber){

    }

    public String toString() {
        return "IPhone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
/*
4. IPhone Task:
		1. Creta a class named IPhone:

				Attributes:
					instance: model, price, color, size
					statics: brand, OS, madeIn

				Add a constructor that can set All the fields (instances)

				Actions:
					faceTime(long phoneNumber)
					faceTime(String email)
					call(long phoneNumber)
					text(long phoneNumber)
					toString()

 */