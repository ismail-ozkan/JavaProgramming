package day38_Inheritance.carTask;

public class Toyota extends Car{

    public Toyota( String model, int year, int miles, String color, double price) {
        super("Toyota", model, year, miles, color, price);
    }

    public void reliabile(){
        System.out.println(brand + " " + model + " is reliable");
    }
    @Override// Optional, we use it for checking if the method is override or not
     public void start(){
         System.out.println("Twist the key to ignition to start  " + brand + " " + model);
     }


}
