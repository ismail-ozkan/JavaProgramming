package day37_Inharitance.phoneTask;

public class Iphone extends Phone{

    public Iphone(String model, String size, int price, String color) {
            super("Apple", model, size, price, color);
    }

    public void facetime(long phoneNumber){
        System.out.println(brand + " " + model + " " + " is having a Face Time with phone number: " + phoneNumber);
    }
    public void facetime(String email){
        System.out.println(brand + " " + model + " " + " is having a Face Time with email: " + email);
    }

}
