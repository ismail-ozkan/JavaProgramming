package day44_Abstraction.carTask;

public class CarShop {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Accord",2020,80000,"Clay");

        Audi audi = new Audi("A8",2018,120000,"White");

        Tesla tesla = new Tesla("Truck",2021,150000,"Gray");

        CydeoCar cydeoCar = new CydeoCar("EU10",2023,150000,"Light-Blue");

        System.out.println(toyota.getModel());

        audi.autoPark();
        AutoPark.methodStatic();
        System.out.println(AutoPark.hasAutoPark);

        tesla.selfDrive();

        cydeoCar.fly();



    }

}
