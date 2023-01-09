package day38_Inheritance.carTask;

import java.lang.Object;
public class Tesla extends Car{

    public Tesla( String model, int year, int miles, String color, double price) {
        super("Tesla", model, year, miles, color, price);
    }
    @Override
    public void start() {
        System.out.println("Say \"Start\" to start "+brand+" "+model);
    }

    public void autoPilot(){

    }


}
