package x_adam_only;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class BMWObject {

    public static void main(String[] args) {

        BMW car1 = new BMW("BMW","3.20","White",75000,5000,2018, LocalDate.of(2017,1,1));
        BMW car2 = new BMW("BMW","4.20","White",75000,5000,2013, LocalDate.of(2017,1,1));
        BMW car3 = new BMW("BMW","5.20","White",75000,5000,2014, LocalDate.of(2017,1,1));
        BMW car4 = new BMW("BMW","1.20","White",75000,5000,2016, LocalDate.of(2017,1,1));
        BMW car5 = new BMW("BMW","2.20","White",75000,5000,2019, LocalDate.of(2017,1,1));

        ArrayList<BMW> buildBefore2017 = new ArrayList<>();
        buildBefore2017.add(car1);
        buildBefore2017.addAll(Arrays.asList(car2,car3,car4,car5));
        System.out.println(buildBefore2017);
        buildBefore2017.removeIf(p -> p.DOfB.isBefore(LocalDate.of(p.year, 1,1)));
        //System.out.println(buildBefore2017);
        System.out.println("-----------------------------------");
        System.out.println("buildBefore2017 = ");
        for (BMW bmw : buildBefore2017) {
            System.out.println(bmw.getbrandName());
        }


    }
}
