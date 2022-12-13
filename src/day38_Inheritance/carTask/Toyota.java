package day38_Inheritance.carTask;

public class Toyota extends Car{
    
    public Toyota(String model, String color, int year, int miles, double price) {
        super("Toyota", model, color, year, miles, price);// here super cons. has an order brand, model, color....
    }
    public void reliabile(){
        System.out.println(brand + " " + model + " is reliable");
    }
    @Override// Optional, we use it for checking if the method is override or not
     public void start(){
         System.out.println("Twist the key to ignition to start  " + brand + " " + model);
     }


}
