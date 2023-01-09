package day38_Inheritance.carTask;

public class ParkingLot {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Corolla", 2011, 20000, "White", 310000);
        Tesla tesla = new Tesla("Model 3", 2015, 45000, "White", 235000);

        BMW bmw = new BMW("M4", 2018, 40000, "White", 19000);


        toyota.start();
        tesla.start();
        bmw.start();


    }
}
