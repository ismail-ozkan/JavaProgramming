package day32_Constructors;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car("Toyota");

        Car car2 = new Car("Honda","Accord");

        Car car3 = new Car("Peugeot","301",2013);

        Car car4 = new Car("BMW","X6",2020,50000);

        Car car5 = new Car("Mercedes","E250",2021,45000);

        System.out.println(car1);
        System.out.println(car2);

    }

}
