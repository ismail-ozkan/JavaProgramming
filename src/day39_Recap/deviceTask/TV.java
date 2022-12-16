package day39_Recap.deviceTask;

public class TV extends Device{
    public TV(String brand, String model, double price) {
        super(brand, model, price);
    }
    public void channelUp(){
        System.out.println("Channeling up "+getBrand()+" "+getModel());
    }
    public void channelDown(){
        System.out.println("Channeling down "+getBrand()+" "+getModel());
    }
}
