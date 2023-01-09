package day38_Inheritance.carTask;

public class BMW extends Car{

    public BMW( String model, int year, int miles, String color, double price) {
        super("BMW", model, year, miles, color, price);
    }
    public void breaksDown(){

    }
    public void racing() {

    }

    public void start() {
        System.out.println("Call mechanic to jump start " + brand + " " + model);
    }
}
