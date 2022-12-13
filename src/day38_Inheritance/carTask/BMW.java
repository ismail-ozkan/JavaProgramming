package day38_Inheritance.carTask;

public class BMW extends Car{

    public BMW(String model, String color, int year, int miles, double price) {
        super("BMW", model, color, year, miles, price);
    }

    public void breaksDown(){

    }
    public void racing() {

    }

    public void start() {
        System.out.println("Call mechanic to jump start " + brand + " " + model);
    }
}
