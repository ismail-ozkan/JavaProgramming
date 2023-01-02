package day43_Abstraction.car;

public class CarShop {

    public static void main(String[] args) {

        //Car car1 = new Car

        //    Car car1 = new Car("Cydeo", "25", "Blue", 2022, 100000);
        // we can not create object from Abstract class, because abstract class is not concrete

        Honda honda = new Honda("Accord","Black",2019,30000);

        Audi audi = new Audi("Q7", "Blue", 2020, 45000);

        Tesla tesla = new Tesla("Model3", "White", 2021, 60000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        honda.setColor("White");
        System.out.println(honda);

    }

}
