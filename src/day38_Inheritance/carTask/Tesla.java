package day38_Inheritance.carTask;

import java.lang.Object;
public class Tesla extends Car{
    public Tesla(String model, String color, int year, int miles, double price) {
        super("Tesla", model, color, year, miles, price);
    }

    @Override
    public void start() {
        System.out.println("Say \"Start\" to start "+brand+" "+model);
    }

    public void autoPilot(){

    }


}
