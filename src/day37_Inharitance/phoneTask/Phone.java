package day37_Inharitance.phoneTask;

public class Phone { // parent class: only contains the common features of all the subclass

    public String brand;
    public String model;
    public String size;
    public int price;
    public String color;

    public static boolean hasBattery;   /* = true*/

    public Phone(String brand, String model, String size, int price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
        //hasBattery = true; we souldn't use the static variable
        //in the constructor, because it creates for every object one time in that case
    }

    /*static{// it is not mandatory to use the static block
            // if there are multiple step to create the static variable
            // then we need to use static block
        hasBattary = true;
    }*/

    public void call(long phoneNumber){
        System.out.println(brand + " " + model + " is calling " + phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(brand + " " + model + " is texting " + phoneNumber);
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= $" + price +
                ", color='" + color + '\'' +
                ", has battery='" + hasBattery + '\'' +
                '}';
    }
}
