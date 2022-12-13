package day37_Inharitance.phoneTask;

public class Nokia extends Phone{

    public Nokia(String model, String size, int price, String color) {
        super("Nokia", model, size, price, color);
    }

    public void selfDefense(){
        System.out.println("You can use "+brand+" "+model+" as self defense tool");
    }

}
