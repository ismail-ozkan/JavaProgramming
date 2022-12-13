package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObject {

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.setInfo("Toyota", "Camry", "White", 2021, 35000);
        car1.start();
        car1.stop();
        car1.worth();

        System.out.println(car1);


       Car car2 =  new Car();

       car2.setInfo("BMW", "335is", "Black", 2020, 45000);

        System.out.println(car2);


        Car car3 = new Car();

        car3.setInfo("Audi", "Q7","White",2019,40000);
        System.out.println(car3);
        System.out.println("--------------------------------");


        //Car[] cars = {car1, car2, car3};

        ArrayList<Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(car1,car2,car3) );
        //System.out.println(carsList);

        for ( Car each : carsList){
            System.out.println(each.brand+" : "+each.price);
        }
        System.out.println("--------------------------------");

        // eligible for recall
        /*
         Recall:
            BMW: 2005 ~ 2008
            Toyota: 1995 ~ 1997
         */
        for (Car car : carsList) {

        }
        carsList.removeIf(p -> p.brand.equals("BMW") && p.year>=2005 && p.year<= 2008);
        carsList.removeIf(p -> p.brand.equals("Toyota") && p.year >=1995 && p.year<=1997 );






    }

}
